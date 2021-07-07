package com.lxx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lixiaoxiang
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello() {

        return "It works~!";
    }
}
