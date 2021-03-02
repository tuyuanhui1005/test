package com.example.test.service.impl;


import com.example.test.dao.testMapper;
import com.example.test.service.TestService;
import org.springframework.stereotype.Service;
import com.example.test.model.test;

import javax.annotation.Resource;

@Service
public class TestServiceImpl  implements TestService {



    @Resource
    testMapper testMapper;

    @Override
    public int add(test test) {

        int insert = testMapper.insert(test);
        return insert;
    }

    @Override
    public test get(int id) {
        test test = testMapper.selectByPrimaryKey(1);
        return  test;
    }
}
