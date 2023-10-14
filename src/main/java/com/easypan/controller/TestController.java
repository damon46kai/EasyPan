package com.easypan.controller;/*
 *
 *@Qianhe Yu 45560
 *@date 10/13/2023 8:23 PM
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test002";
    }
}
