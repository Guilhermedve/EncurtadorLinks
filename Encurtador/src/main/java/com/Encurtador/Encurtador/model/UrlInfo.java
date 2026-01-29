package com.Encurtador.Encurtador.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;


@Data
@Entity
public class UrlInfo {

@Id
@GeneratedValue(strategy = GenerationType.UUID)
private UUID id;

@Column
private  String originalUrl;
private String codigoGerado;

public UrlInfo(String originalUrl , String codigoGerado){
    this.originalUrl=originalUrl;
    this.codigoGerado=codigoGerado;

}

}
