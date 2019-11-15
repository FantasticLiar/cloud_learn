package com.imlegend.service_feign.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements schedualServiceHi {

    @Override
    public String sayHiFromClientOne() {
        return "sorry, hiService error";
    }
}
