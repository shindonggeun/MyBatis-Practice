package com.example.backend.adaptor.in.web;

import com.example.backend.adaptor.in.web.dto.MemberSignupRequest;
import com.example.backend.application.port.in.member.MemberCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberCommandService memberCommandService;

    @PostMapping("/signup")
    public ResponseEntity<Integer> signupMember(@RequestBody MemberSignupRequest signupRequest) {
        return ResponseEntity.ok(memberCommandService.signupMember(signupRequest));
    }
}
