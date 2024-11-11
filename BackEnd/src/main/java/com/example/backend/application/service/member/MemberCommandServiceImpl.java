package com.example.backend.application.service.member;

import com.example.backend.adaptor.in.web.dto.MemberSignupRequest;
import com.example.backend.application.port.in.member.MemberCommandService;
import com.example.backend.application.port.out.persistence.member.MemberCommandRepoPort;
import com.example.backend.application.port.out.persistence.member.MemberQueryRepoPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService {

    private final MemberQueryRepoPort queryRepoPort;
    private final MemberCommandRepoPort commandRepoPort;

    @Override
    public int signupMember(MemberSignupRequest signupRequest) {
        if (queryRepoPort.existsByEmail(signupRequest.getEmail())) {
            throw new RuntimeException("Email already in use");
        }

        return commandRepoPort.save(signupRequest);
    }
}
