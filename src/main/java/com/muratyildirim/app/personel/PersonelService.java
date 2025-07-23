package com.muratyildirim.app.personel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.personel.dto.PersonelDTO;
import com.muratyildirim.app.shared.ConvertModel;

@Service
public class PersonelService {

	@Autowired
	PersonelRepository personelRepository;
	
	@Autowired
	ConvertModel convertModel;

	//signup icin
	Page<PersonelDTO> getAllPersonel(Pageable pageable) {
		Page<Personel> inDB = personelRepository.findAll(pageable);
		return inDB.map(PersonelDTO::new);
	}
	
	PersonelDTO getDefaultPersonel(String kodu) {
		Personel inDB = personelRepository.findByKodu(kodu);
		return convertModel.convertObject(inDB, PersonelDTO.class);
	}
	
	Page<PersonelDTO> getSearchPersonel(byte subeId, Pageable pageable) {
		Page<Personel> inDB = personelRepository.findBySubeId(subeId, pageable);
		return convertModel.convertPage(inDB, PersonelDTO.class);
	}

}
