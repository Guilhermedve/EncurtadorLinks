package com.encurtador.encurtadorweb.repository;
import org.springframework.data.repository.CrudRepository;
import com.encurtador.encurtadorweb.model.UrlInfo;

public interface repositorioUrl extends CrudRepository<UrlInfo, Long> {

   <S extends UrlInfo> S save(S entity);

    String findByShortUrl(String shortUrl);

}
