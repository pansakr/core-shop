package com.ayoh.coreshop.controller;

import com.ayoh.coreshop.dto.MemberLoginRequest;
import com.ayoh.coreshop.dto.MemberSignUpRequest;
import com.ayoh.coreshop.entity.Member;
import com.ayoh.coreshop.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

    // TODO: MemberService 를 주입받으세요.

    private final MemberService memberService;

    @GetMapping("/signup")
    public String goSignUpPage(){
        return "pages/members/signUpPage";
    }

    @PostMapping("/signup")
    public String doSignUp(@ModelAttribute MemberSignUpRequest memberSignUpRequest, Model model) {

        // System.out.println();
        log.info("memberSignUpRequest.getName(): {}", memberSignUpRequest.getName());
        log.info("memberSignUpRequest.getPassword(): {}", memberSignUpRequest.getPassword());

        // 회원가입 비즈니스 로직 수행
        Member member = memberService.signUp(memberSignUpRequest);

        model.addAttribute("member", member);

        // A page -> B page (forwarding: 전달) -> C page -> B page -> A page
        // 클라이언트와 서버 간의 끊임 없는 요청과 응답
        // HTTP 의 특징: 1) 비연결성(connectless): 요청 -> 응답 = 끝! 2) 비상태성(stateless)
        return "pages/members/signUpSuccess";
    }

    @PostMapping
    public String doLogin(MemberLoginRequest memberRequest) {
        // 로그인 처리를 하기 위해 회원 서비스의 로그인 비즈니스 로직을 호출
        Member member = memberService.login(memberRequest);
        return "";
    }

    @GetMapping("/login")
    public String goLoginPage(Model model){
        return "pages/auth/login";
    }

}
