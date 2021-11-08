package com.victolee.signuplogin.controller;

import java.util.List;
import java.util.Map;

import com.victolee.signuplogin.dto.SimpleMessageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Autowired
    SimpleMessageDAO smd;

    @RequestMapping("/members")
    public List<Map<String, ?>> getMessages() {
        return smd.selectAll();
    }
}