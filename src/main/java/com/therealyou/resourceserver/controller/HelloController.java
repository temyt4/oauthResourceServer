package com.therealyou.resourceserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> hello(Authentication authentication){
        Map<String, Object> map = new HashMap<>();
        map.put("roflan", "ebalo");
        map.put("pog", "champ");
        log.info(authentication.toString());
        return ResponseEntity.status(200).body(map);
    }
}
