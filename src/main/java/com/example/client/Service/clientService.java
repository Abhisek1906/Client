package com.example.client.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface clientService {
    ResponseEntity<?> check(String token);
}
