package me.lidonghe.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public int sum(int a, int b) {
        return a + b;
    }

}
