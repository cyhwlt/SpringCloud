package com.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(path="/provider", method = RequestMethod.GET)
    public String provider(){
        return "我是服务提供者";
    }
}
