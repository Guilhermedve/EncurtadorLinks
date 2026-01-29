package com.encurtador.encurtadorweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encurtador.encurtadorweb.model.UrlInfo;
import com.encurtador.encurtadorweb.model.component.Gerador;
import com.encurtador.encurtadorweb.repository.repositorioUrl;
import com.encurtador.encurtadorweb.service.serviceUrl;
@RestController("obterUrl")
public class controllerUrl {
  private serviceUrl serviceUrl1;

@PostMapping("/1°phase")
public String obterUrl(String originalUrl){
   String urlEncurtada = serviceUrl1.encurtarUrl(originalUrl);
   return urlEncurtada; 
}}