package com.muratyildirim.app.personel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonelRepository extends JpaRepository<Personel, Integer> {
	
	Personel findByKodu(String kodu);
	
	Page<Personel> findBySubeId(Byte subeId, Pageable pageable);
	
}
