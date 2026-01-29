package com.Encurtador.Encurtador.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Encurtador.Encurtador.model.UrlInfo;

@Repository
public interface RepositoryInterface extends JpaRepository <UrlInfo, UUID> {
    void salvarUrls ( UrlInfo originalUrl , UrlInfo codigoGerado);
    
    boolean existeCodigo(String codigoGerado);

}
