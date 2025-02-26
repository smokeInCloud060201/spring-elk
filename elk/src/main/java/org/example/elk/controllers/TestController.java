package org.example.elk.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/{id}")
    public ResponseEntity<String> test(@PathVariable("id") int id) {
        log.info("Testing id {}", id);
        return ResponseEntity.ok("Hello World for id " + id);
    }
}
