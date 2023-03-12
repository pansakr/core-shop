package com.ayoh.coreshop.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberLoginRequest {
    private String username;
    private String password;
}
