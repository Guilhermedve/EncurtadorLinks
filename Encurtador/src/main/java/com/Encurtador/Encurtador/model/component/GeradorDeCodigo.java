package com.Encurtador.Encurtador.model.component;

import org.springframework.stereotype.Component;

import com.Encurtador.Encurtador.model.UrlInfo;

@Component
public class GeradorDeCodigo {

private static final int comprimento = 6; 
   private static final StringBuilder sb = new StringBuilder( );
    private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
private static String codigo= "";

public static String Gerador(UrlInfo originalUrl){
for(int i= 0; i < comprimento; i++){
    int indice = (int) (Math.random()* CARACTERES.length());
    sb.append(CARACTERES.charAt(indice));
    codigo = sb.toString();
    
}
return codigo;
}


}
