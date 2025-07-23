package com.muratyildirim.app.ozelkodlar;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OzelKodlarRepository extends JpaRepository<OzelKodlar, Integer> {

    List<OzelKodlar> findByKodNo(byte kodNo);

}
