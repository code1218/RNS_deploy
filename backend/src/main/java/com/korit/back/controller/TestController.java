package com.korit.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController {

    @GetMapping("/api/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/oauth2/test2")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok("oauth2");
    }

    @GetMapping("/image/{fileName}")
    public ResponseEntity<String> test3(@PathVariable String fileName) {
        return ResponseEntity.ok("image: " + fileName);
    }
}
