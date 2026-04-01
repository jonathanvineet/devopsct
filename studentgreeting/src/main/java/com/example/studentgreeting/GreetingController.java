package com.example.studentgreeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
  @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
  public String greeting() { return "<html><body><h1>Hello, System!</h1></body></html>"; }
}