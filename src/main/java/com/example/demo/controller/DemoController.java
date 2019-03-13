package com.example.demo.controller;

import com.example.demo.vo.DemoReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
    @PostMapping
    public String collectByScan(@RequestBody DemoReq params) {
        return params.toString();
    }
}
