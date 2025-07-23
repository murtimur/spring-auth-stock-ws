package com.muratyildirim.app.personel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.app.personel.dto.PersonelDTO;
import com.muratyildirim.app.personel.dto.PersonelSearchDTO;

@RestController
public class PersonelController {

	@Autowired
	PersonelService personelService;

	@GetMapping("/api/v1/personeller")
	Page<PersonelDTO> getAllPersonel(Pageable pageable) {
		return personelService.getAllPersonel(pageable);
	}
	
	@GetMapping("/api/v1/personel/{kodu}")
	PersonelDTO getDefaultPersonel(@PathVariable String kodu) {
		return personelService.getDefaultPersonel(kodu);
	}
	
	@PostMapping("/api/v1/personelsearch")
	Page<PersonelDTO> getPersonelSearch(@RequestBody PersonelSearchDTO personel, Pageable pageable) {
		return personelService.getSearchPersonel(personel.subeId(), pageable);
	}

}
