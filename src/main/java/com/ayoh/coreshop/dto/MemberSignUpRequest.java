package com.ayoh.coreshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
//@AllArgsConstructor
@Setter
public class MemberSignUpRequest {

    // String 은 참조 자료형, 멤버 변수로 따로 초기화를 하지 않을 경우 디폴트 값으로 null
    // DTO Projection(투사, 투입)
    private String email;
    private String password;
    private String name;
    private String address;

    public MemberSignUpRequest() {
    }

}
