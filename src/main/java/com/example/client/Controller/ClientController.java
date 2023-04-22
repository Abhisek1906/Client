package com.example.client.Controller;

import com.example.client.Service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private clientService  clientService;

    @GetMapping("/demo")
    public ResponseEntity<?> demo(@RequestHeader(name="Authorization") String token){
        System.out.println(token);
        return clientService.check(token);
    }
}
