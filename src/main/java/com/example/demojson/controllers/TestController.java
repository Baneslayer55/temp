package com.example.demojson.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @GetMapping("/data")
    public List<TestData> temp(){
        return List.of(
                new TestData("s1", "s2", 3),
                new TestData("s11", "s22", 33),
                new TestData("s111", "s222", 333)
        );
    }
}
