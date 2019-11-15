package com.imlegend.service_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-hi",fallback = HystrixClientFallback.class)
public interface schedualServiceHi {

    @GetMapping("/hi")
    String sayHiFromClientOne();
}