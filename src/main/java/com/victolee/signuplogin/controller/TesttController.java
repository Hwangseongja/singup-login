package com.victolee.signuplogin.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TesttController {

        @GetMapping(value = "/member")
        @ResponseBody // public @ResponseBody String testByResponseBody()와 같이 리턴 타입 좌측에 지정 가능
        public Map<String, Object> testByResponseBody() {
                Map<String, Object> member = new HashMap<>();
                member.put("result", 0);

            return member;
        }

    }


