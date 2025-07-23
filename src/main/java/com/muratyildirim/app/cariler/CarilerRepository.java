package com.muratyildirim.app.cariler;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarilerRepository extends JpaRepository<Cariler, Integer> {

	// signup customer search method
	Page<Cariler> findByAdiContainingAndDurum(String adi, byte durum, Pageable pageable);

	// get default customer
	Cariler findByKodu(String kodu);

	// Bu method Cari arama yapar subeId ye gore
	Page<Cariler> findByAdiContainingAndSubeIdAndDurum(String adi, Short subeId, Byte durum, Pageable pageable);

	// bu method cari arama yapar ozelKod3, subeId ye gore
	Page<Cariler> findByAdiContainingAndSubeIdAndOzelKod3AndDurum(String adi, Short subeId, Integer ozelKod3,
			Byte durum, Pageable pageable);

	// bu method son cariyi bulur id'ye gore siralayip
	Cariler findTopByOrderByIdDesc();

}
