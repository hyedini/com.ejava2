package com.ejava.program.member.service;

import com.ejava.program.member.service.dto.MemberDto;

import java.util.List;

public interface MemberService {
    public List<MemberDto> memberList() throws Exception;
}