package com.encurtador.encurtadorweb.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.encurtador.encurtadorweb.model.UrlInfo;
@Repository
public interface repositorioUrl extends CrudRepository<UrlInfo, Long> {

    boolean existsByShortUrl(String shortUrl);

}
