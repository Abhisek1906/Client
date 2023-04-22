package com.example.client.Service;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "serverFeign", url = "http://localhost:8083/server")
public interface ServerFeign {

    @GetMapping("/check")
    public ResponseEntity<String> check(@RequestHeader(name="Authorization") String token);
}
