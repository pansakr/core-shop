package com.ayoh.coreshop.withoutspringsecurity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignRequest {

    private String username;
    private String password;

}
