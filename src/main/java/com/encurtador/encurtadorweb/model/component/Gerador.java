package com.encurtador.encurtadorweb.model.component;

public class Gerador {
    
    public String gerarCodigo() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tamanho = 6;
        StringBuilder codigo = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int indice = (int) (Math.random() * caracteres.length());
            codigo.append(caracteres.charAt(indice));
        }
        return codigo.toString();
    }
}
