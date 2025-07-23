package com.muratyildirim.app.dovizkurlari;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface DovizKurlariRepository extends JpaRepository<DovizKurlari, Integer> {

  DovizKurlari findByTarihAndDoviz(LocalDateTime tarih, String doviz);

}
