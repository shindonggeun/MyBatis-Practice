package com.example.backend.application.port.out.persistence.member;

import com.example.backend.adaptor.in.web.dto.MemberSignupRequest;

public interface MemberCommandRepoPort {

    int save(MemberSignupRequest signupRequest);
}
