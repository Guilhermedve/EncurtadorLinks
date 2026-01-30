package com.encurtador.encurtadorweb.service;

import org.springframework.stereotype.Service;

import com.encurtador.encurtadorweb.model.UrlInfo;
import com.encurtador.encurtadorweb.model.component.Gerador;
import com.encurtador.encurtadorweb.repository.repositorioUrl;
@Service
public class serviceUrl {
//Contrutores e Injeção de Dependência
        private repositorioUrl repositorioUrl1;
          public serviceUrl(repositorioUrl repositorioUrl1) {
        this.repositorioUrl1 = repositorioUrl1;
    }
    private static final String BASE_URL = "http://short.url/";
    private Gerador geradorCodigoString;
//

// Método para encurtar uma URL
    public String encurtarUrl(String originalUrl) {
        String codigoCurto = geradorCodigoString.gerarCodigo();

UrlInfo e = new UrlInfo(originalUrl, codigoCurto); 
e.setOriginalUrl(originalUrl);
e.setShortUrl(codigoCurto);
        repositorioUrl1.save(e);

        return BASE_URL+codigoCurto;
    }
// Método para verificar se a URL encurtada já existe
public boolean verificarUrlExistente(String shortUrl){
   if (repositorioUrl1.existsByShortUrl(shortUrl)){
      return true;
   }
   return false;
}
}



