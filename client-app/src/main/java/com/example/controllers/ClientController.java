package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * |** @author 'Gihan Rathnayaka'**|
 */
@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${endpoint.ms-service}")
    private String url;

    @GetMapping(value = "/call-server")
    public String getCallingServer(){

        return restTemplate.getForEntity(url+"api/ssl-calling",String.class).getBody();
    }
}
