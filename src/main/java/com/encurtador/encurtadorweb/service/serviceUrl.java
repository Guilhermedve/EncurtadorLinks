package com.encurtador.encurtadorweb.service;

import com.encurtador.encurtadorweb.model.UrlInfo;
import com.encurtador.encurtadorweb.model.component.Gerador;
import com.encurtador.encurtadorweb.repository.repositorioUrl;

public class serviceUrl {

        private repositorioUrl repositorioUrl1;
    private static final String BASE_URL = "http://short.url/";
    private Gerador geradorCodigoString;

    public String encurtarUrl(String originalUrl) {
        String codigoCurto = geradorCodigoString.gerarCodigo();
        UrlInfo urlInfo = new UrlInfo(originalUrl, codigoCurto);
        urlInfo.setOriginalUrl(originalUrl);
        urlInfo.setShortUrl(codigoCurto);
        repositorioUrl1.save(urlInfo);

        return BASE_URL + codigoCurto;
    }

}
