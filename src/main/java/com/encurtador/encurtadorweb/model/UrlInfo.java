package com.encurtador.encurtadorweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "url_info")
@Getter
public class UrlInfo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String originalUrl;

@Column(unique = true)
private String shortUrl;



public UrlInfo(String originalUrl, String shortUrl) {
    this.originalUrl = originalUrl;
    this.shortUrl = shortUrl;

}
public void setOriginalUrl(String originalUrl){
    this.originalUrl = originalUrl;
}
public void setShortUrl(String shortUrl){
    this.shortUrl = shortUrl;
 }} 