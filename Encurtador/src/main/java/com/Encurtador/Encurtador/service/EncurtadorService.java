package com.Encurtador.Encurtador.service;



import org.springframework.stereotype.Service;

import com.Encurtador.Encurtador.model.UrlInfo;
import com.Encurtador.Encurtador.model.component.GeradorDeCodigo;
import com.Encurtador.Encurtador.repository.RepositoryInterface;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class EncurtadorService {
private final GeradorDeCodigo gerador;
private final RepositoryInterface repository; 

public String encurtarCodigo(UrlInfo urlInfo){ 

String codigo = GeradorDeCodigo.Gerar();
urlInfo.setCodigoGerado(codigo);
repository.save(urlInfo);
return codigo;
}

public boolean buscarUrlCodigo(String codigo){
return repository.existeCodigo(codigo);
}
}
