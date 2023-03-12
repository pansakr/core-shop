package com.ayoh.coreshop.service;

import com.ayoh.coreshop.dto.MemberLoginRequest;
import com.ayoh.coreshop.dto.MemberSignUpRequest;
import com.ayoh.coreshop.entity.Member;
import com.ayoh.coreshop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class DefaultMemberService implements MemberService, UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public Member signUp(MemberSignUpRequest memberSignUpRequest) {
        // JPA 의 save 메서드에 인자 타입은 엔티티 타입으로 줘야 한다!
        // 그런데, 지금 매개변수로 받은 건 DTO 타입
        // DTO -> Entity -> save 메서드의 인자로 전달


        // 빈 껍데기 -> 값 채우는 방식 (setter) -> 자바빈즈: setter 값 세팅하는 방식
        Member member = new Member();
        member.setId(1L);
        member.setEmail(memberSignUpRequest.getEmail());
        member.setPassword(memberSignUpRequest.getPassword());
        member.setName(memberSignUpRequest.getName());
        member.setAddress(memberSignUpRequest.getAddress());
        member.setRole("ROLE_MEMBER");
        member.setCreatedDate(LocalDateTime.now());

        // TODO: JPA 의 INSERT 문에 해당하는 메서드를 호출하세요.
        Member savedMember = memberRepository.save(member);

        return savedMember;
    }

    @Override
    public Member login(MemberLoginRequest memberRequest) {
        // 뭘 하면 로그인 인증을 했다고 검증할 것인가?

        // 1. DB 에 가서 아이디 일치 여부 확인 -> SELECT
        Member foundMember = memberRepository.findByEmail(memberRequest.getUsername());

        // 회원 정보가 있는지 없는지 분기 처리
        // 안되는 케이스 먼저 작성
        if (foundMember == null) {
            // 예외 처리
            throw new IllegalArgumentException("아이디가 일치하지 않습니다.");
        }

        // 이 밑에 온다면 not null 반증
        // 2. DB 에 가서 비밀번호 일치 여부 확인 -> SELECT

        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
