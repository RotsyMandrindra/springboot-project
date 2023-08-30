package com.example.finalexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping(value = "/ping", produces = "text/plain")
  public String ping() {
    return "pong";
  }
}
