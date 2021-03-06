package com.example.service;

import com.example.pojo.GymMember;

public interface MemberService {
    GymMember findByPhone(String phone);
    void changeMemberName(String phone, String newName);
    void changePasswd(String phone, String newPasswd);
    GymMember findById(String id);
    void updateCoach(String phone, Long coach_id);
}
