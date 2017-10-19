package com.hikuley.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "Hello User! Here is index page...";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login() {
        return "Hello User! Here is login page...";
    }


    @RequestMapping(value = "/securedPage", method = RequestMethod.GET)
    @ResponseBody
    public String securedPage() {
        return "Hello User! Secured Page...";
    }

}
