package com.example.backend.application.port.out.persistence.member;

import com.example.backend.domain.Member;
import java.util.UUID;

public interface MemberQueryRepoPort {

    Member findById(UUID id);

    boolean existsByEmail(String email);
}
