package com.imlegend.service_feign.controller;

import com.imlegend.service_feign.service.schedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private schedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi() {
        return schedualServiceHi.sayHiFromClientOne();
    }
}