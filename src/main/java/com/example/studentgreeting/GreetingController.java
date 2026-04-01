package com.example.studentgreeting;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
  public String greeting() { return "<html><body><h1>Hello, Student!</h1></body></html>"; }
}