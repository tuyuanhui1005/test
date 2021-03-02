package com.example.test.service;


import com.example.test.model.test;
import org.springframework.stereotype.Service;


public interface TestService {

    int add(test test);

    test get(int id);
}
