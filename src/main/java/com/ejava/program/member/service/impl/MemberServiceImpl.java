package com.ejava.program.member.service.impl;

import com.ejava.program.member.service.MemberService;
import com.ejava.program.member.service.dao.MemberDao;
import com.ejava.program.member.service.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDao memberDao;

    @Override
    public List<MemberDto> memberList() throws Exception {
        return memberDao.memberList();
    }
}