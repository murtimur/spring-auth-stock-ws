package com.muratyildirim.app.cariler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.muratyildirim.app.cariler.dto.CarilerDTO;
import com.muratyildirim.app.cariler.dto.CarilerSearchDTO;

@RestController
public class CarilerController {

	@Autowired
	CarilerService carilerService;

	@GetMapping("/api/v1/findbyadi/{adi}")
	Page<CarilerDTO> findByAdiContainingAndDurum(@PathVariable String adi, Pageable pageable) {
		return carilerService.findByAdiContainingAndDurum(adi, pageable);
	}

	@GetMapping("/api/v1/cari/{kodu}")
	CarilerDTO getUserDefaultCari(@PathVariable String kodu) {
		return carilerService.getUserDefaultCari(kodu);
	}

	@PostMapping("/api/v1/cariler")
	Page<CarilerDTO> getCariSearch(@RequestBody CarilerSearchDTO cari, Pageable pageable) {
		return carilerService.getCariSearch(cari, pageable);
	}

}
