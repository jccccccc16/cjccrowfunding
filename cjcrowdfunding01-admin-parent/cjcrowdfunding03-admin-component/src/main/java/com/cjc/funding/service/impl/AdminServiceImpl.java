package com.cjc.funding.service.impl;

import com.cjc.funding.entity.Admin;
import com.cjc.funding.mapper.AdminMapper;
import com.cjc.funding.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public void save(Admin admin) {

        adminMapper.insert(admin);
        int i = 1/0;
    }
}
