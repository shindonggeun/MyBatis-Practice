package com.example.backend.adaptor.out.persistence.member.mapper;

import com.example.backend.adaptor.in.web.dto.MemberSignupRequest;
import com.example.backend.domain.Member;
import java.util.UUID;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    int existsByEmail(@Param("email") String email);

    Member findMemberById(@Param("id") UUID id);

    int insertMember(MemberSignupRequest signupRequest);
}
