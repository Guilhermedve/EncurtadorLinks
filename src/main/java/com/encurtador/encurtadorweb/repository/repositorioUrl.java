package com.encurtador.encurtadorweb.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.encurtador.encurtadorweb.model.UrlInfo;
@Repository
public interface repositorioUrl extends CrudRepository<UrlInfo, Long> {

   <S extends UrlInfo> S save(S entity);

Optional<UrlInfo> findByShortUrl(String shortUrl);

    boolean existsByShortUrl(String shortUrl);

}
