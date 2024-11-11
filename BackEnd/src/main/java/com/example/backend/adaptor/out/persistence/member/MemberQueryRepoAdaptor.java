package com.example.backend.adaptor.out.persistence.member;

import com.example.backend.adaptor.out.persistence.member.mapper.MemberMapper;
import com.example.backend.application.port.out.persistence.member.MemberQueryRepoPort;
import com.example.backend.domain.Member;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberQueryRepoAdaptor implements MemberQueryRepoPort {

    private final MemberMapper memberMapper;

    @Override
    public Member findById(UUID id) {
        return memberMapper.findMemberById(id);
    }

    @Override
    public boolean existsByEmail(String email) {
        return memberMapper.existsByEmail(email) > 0;
    }
}
