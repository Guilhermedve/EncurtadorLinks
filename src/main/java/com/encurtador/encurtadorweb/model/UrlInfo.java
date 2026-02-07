package com.encurtador.encurtadorweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "url_info")
public class UrlInfo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false) 
private String originalUrl;

@Column(nullable = false, unique = true, length = 6)
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
 }
void getUrlInfo(){
    System.out.println("Original URL: " + originalUrl);
    System.out.println("Short URL: " + shortUrl);
}  
}