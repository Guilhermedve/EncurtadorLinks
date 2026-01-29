package com.Encurtador.Encurtador.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Encurtador.Encurtador.model.UrlInfo;
import com.Encurtador.Encurtador.model.component.GeradorDeCodigo;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@AllArgsConstructor
@RequestMapping("/Encurtador")
public class EncurtadorController {
private final GeradorDeCodigo gerador;

@GetMapping
public String requestMethodName(@RequestParam UrlInfo urlInfo) {
    String urlOriginal = urlInfo.getOriginalUrl();
    return new String();
}









        return new String();
    }
}
