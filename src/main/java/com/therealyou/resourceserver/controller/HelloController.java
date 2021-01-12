package com.therealyou.resourceserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> hello(){
        Map<String, Object> map = new HashMap<>();
        map.put("roflan", "ebalo");
        map.put("pog", "champ");
        return ResponseEntity.status(200).body(map);
    }
}
