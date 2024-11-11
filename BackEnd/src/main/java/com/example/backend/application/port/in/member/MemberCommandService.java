package com.example.backend.application.port.in.member;

import com.example.backend.adaptor.in.web.dto.MemberSignupRequest;

public interface MemberCommandService {

    int signupMember(MemberSignupRequest signupRequest);
}
