package com.ayoh.coreshop.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final AuthenticationSuccessHandler authenticationSuccessHandler;
    private final AuthenticationFailureHandler authenticationFailureHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();

        // 메서드 체이닝
        // 인가에 관련된 설정
        http.authorizeHttpRequests()
                .anyRequest()
                .permitAll();

        // 인증과 관련된 설정

        http.formLogin()
                .loginPage("/login") // 내가만든 페이지 연결, getMapping
                .loginProcessingUrl("/auth/login") // 프로세싱붙은건 post요청 ~해줘
                .defaultSuccessUrl("/")
                .successHandler(this.authenticationSuccessHandler)
                .failureHandler(this.authenticationFailureHandler)
                .permitAll();

        // 로그아웃을 커스터마이징
        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login");

        return http.build();
    }

}
