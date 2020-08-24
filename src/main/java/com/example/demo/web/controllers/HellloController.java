package com.example.demo.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mk on 2020/08/23
 */
@RestController
@RequestMapping("/v1/api")
public class HellloController {

    @GetMapping("hello")
    public String hello() {
        return "hello world !";
    }
}
