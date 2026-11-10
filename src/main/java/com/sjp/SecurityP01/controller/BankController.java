package com.sjp.SecurityP01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class BankController {

    @GetMapping("/info")
    public String info()
    {
        return "get loan @7%";
    }
}
