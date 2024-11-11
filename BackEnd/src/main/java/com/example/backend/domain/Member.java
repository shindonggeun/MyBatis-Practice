package com.example.backend.domain;

import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor  // 기본 생성자 필요할 경우 추가
@AllArgsConstructor(access = AccessLevel.PROTECTED)  // 필요 시 전체 필드 생성자 추가
public class Member {

    private UUID id;

    private String email;

    private String password;

    private String name;

    private Boolean enabled;
}
