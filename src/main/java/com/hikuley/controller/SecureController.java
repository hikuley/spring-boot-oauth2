package com.hikuley.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecureController {

    @RequestMapping(value = "/secure", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Secure Hello!";
    }


    @RequestMapping(value = "/anonymous", method = RequestMethod.GET)
    @ResponseBody
    public String sayHelloWithoutAuthority() {
        return "Hello anonymous user";
    }
}
