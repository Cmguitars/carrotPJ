package com.exercise.carrotproject.domain.member.login;

import com.exercise.carrotproject.domain.member.entity.Member;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public Member login(String loginId, String password);
}
