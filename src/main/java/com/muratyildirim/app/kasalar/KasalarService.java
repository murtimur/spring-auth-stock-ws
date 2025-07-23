package com.muratyildirim.app.kasalar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.kasalar.dto.KasalarDTO;

@Service
public class KasalarService {
	
	@Autowired
	KasalarRepository kasalarRepository;
	
	List<KasalarDTO> getAllKasalar() {
		List<Kasalar> inDB = kasalarRepository.getAllKasalar();
		return inDB.stream().map(KasalarDTO::new).toList();
	}

}
