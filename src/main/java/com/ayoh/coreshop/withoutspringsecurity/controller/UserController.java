package com.ayoh.coreshop.withoutspringsecurity.controller;

import com.ayoh.coreshop.withoutspringsecurity.dto.UserSignRequest;
import com.ayoh.coreshop.withoutspringsecurity.entity.User;
import com.ayoh.coreshop.withoutspringsecurity.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // get : ~줘!
    // post : ~해줘!(없던거 -> 만들어주거나)
    // put, patch : 고쳐줘!

//    @PostMapping("/signup")  기존코드
//    public ResponseEntity<User> doSignUp(@RequestBody User user){
//        //아이디 중복 체크
//        if(userRepository.findByUsername(user.getUsername()).isPresent()){ // Optional 인스턴스 생성 안했는데 isPresent()어떻게 사용함?
//            // 만약에 요창한 아이디가 이미 존재할 경우 예외 처리
//            ResponseEntity.badRequest().body("아이디가 이미 존재합니다.");
//        }
//
//        User savedUser = userRepository.save(user);
//        return ResponseEntity.ok(savedUser);
//    }

//    @PostMapping("/login")  기존코드
//    public ResponseEntity<String> doLogin(@RequestBody User user, HttpSession session){
//
//        session.setAttribute("userId",user.getId());
//        return ResponseEntity.ok("로그인 성공!");
//    }

    @PostMapping("/login")
    public ResponseEntity<String> doLogin(@RequestBody UserSignRequest userSignRequest, User user, HttpSession session){

        UserSignRequest userSignRequest1 = userRepository.findByUsername(userSignRequest.getUsername());
        UserSignRequest userSignRequest2 = userRepository.findByPassword(userSignRequest.getPassword());

        if(userSignRequest1.getUsername() != null) {
            if(userSignRequest2.getPassword() == user.getPassword()) {
                session.setAttribute("userId", user.getId());
                session.setAttribute("userId", user.getId());
                return ResponseEntity.ok("로그인 성공!");
            }
        }
        return ResponseEntity.badRequest().body("로그인 실패");
    }

    @PostMapping("/logout")
    public ResponseEntity<?> doLogout(HttpSession session){
        //valid : 유효한, invalid: 무효, invalidate : 무효화하다
        session.invalidate();
        return ResponseEntity.ok().build();
    }
}
