package com.example.test.controller;

import com.example.test.model.test;
import com.example.test.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/add")
@RestController
public class TestController {

    @Resource
    TestService TestService;


    @RequestMapping("/test/{id}/{name}")
    public int add(@PathVariable int id, @PathVariable String name) {
        test test = new test();
        test.setId(id);
        test.setName(name);
        System.out.println(id);
        int i = TestService.add(test);
        return 1;
    }

    @RequestMapping("get/{id}")
    public test getTest(@PathVariable int id) {
        test test = TestService.get(id);
        return test;
    }


}
