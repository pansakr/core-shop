package com.ayoh.coreshop.withoutspringsecurity.repository;

import com.ayoh.coreshop.withoutspringsecurity.dto.UserSignRequest;
import com.ayoh.coreshop.withoutspringsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //Optional<User> findByUsername(String Username);

    UserSignRequest findByUsername(String username);

    UserSignRequest findByPassword(String password);

    // 쿼리 메소드 만드는 방법 모르겠음
}
