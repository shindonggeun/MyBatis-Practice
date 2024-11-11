package com.example.backend.adaptor.out.persistence.member;

import com.example.backend.adaptor.in.web.dto.MemberSignupRequest;
import com.example.backend.adaptor.out.persistence.member.mapper.MemberMapper;
import com.example.backend.application.port.out.persistence.member.MemberCommandRepoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberCommandRepoAdaptor implements MemberCommandRepoPort {

    private final MemberMapper memberMapper;

    @Override
    public int save(MemberSignupRequest signupRequest) {
        return memberMapper.insertMember(signupRequest);
    }
}
