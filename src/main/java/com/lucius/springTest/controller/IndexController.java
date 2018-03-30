package com.lucius.springTest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping("")
    public Map<String,Integer> rootGET() {
        Map<String,Integer> map = new HashMap<>();

        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        return map;
    }
}
