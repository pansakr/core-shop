package com.ayoh.coreshop.service;

import com.ayoh.coreshop.dto.MemberLoginRequest;
import com.ayoh.coreshop.dto.MemberSignUpRequest;
import com.ayoh.coreshop.entity.Member;

public interface MemberService {

    Member signUp(MemberSignUpRequest memberSignUpRequest);

    Member login(MemberLoginRequest memberRequest);

}
