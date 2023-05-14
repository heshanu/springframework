package com.dailycodebuffer.springbootdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{

    @Override
    public String test() {
        return "test";
    }
}
