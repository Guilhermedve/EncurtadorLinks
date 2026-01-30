package com.encurtador.encurtadorweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.encurtador.encurtadorweb.service.serviceUrl;
@RestController("obterUrl")
public class controllerUrl {
  private serviceUrl serviceUrl1;

@PostMapping("/1°phase")
public String obterUrl(@RequestBody String originalUrl){
   return serviceUrl1.encurtarUrl(originalUrl);
}}