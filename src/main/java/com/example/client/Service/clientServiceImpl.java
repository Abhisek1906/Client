package com.example.client.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class clientServiceImpl implements clientService{
    @Autowired
    private ServerFeign feign;
    @Override
    public ResponseEntity<?> check(String token) {
        System.out.println("here!");
        return feign.check(token);
    }
}
