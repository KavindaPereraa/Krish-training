package com.kavinda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControlelr {

    @RequestMapping("/")
    public String greeting(){
        return "<h1> <b> Welcome By  Kavinda ..Spring  Boot  Test  !! </b></h1>";
    }

}
