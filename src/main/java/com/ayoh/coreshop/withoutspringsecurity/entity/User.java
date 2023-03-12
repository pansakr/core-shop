package com.ayoh.coreshop.withoutspringsecurity.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private Long id;



    // 이메일, 휴대폰 번호, 임의의 문자열, ...
    private String username;

    // 암호화해서 넣는 컬럼
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
