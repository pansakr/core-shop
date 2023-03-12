package com.ayoh.coreshop.repository;

import com.ayoh.coreshop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {


    // SELECT * FROM members WHERE email = {username};
    Member findByEmail(String username);

}
