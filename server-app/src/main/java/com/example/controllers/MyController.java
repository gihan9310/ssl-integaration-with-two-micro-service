package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * |** @author 'Gihan Rathnayaka'**|
 */

@RestController
@RequestMapping(value = "/api")
public class MyController {

   @GetMapping(value = "ssl-calling")
    public String getData() {
        return "Response Come from Server you done it.";
    }
}
