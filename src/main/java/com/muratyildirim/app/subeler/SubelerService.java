package com.muratyildirim.app.subeler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.subeler.dto.SubelerDTO;

@Service
public class SubelerService {

	@Autowired
	SubelerRepository subelerRepository;

	List<SubelerDTO> getAllSubeler() {
		List<Subeler> inDB = subelerRepository.getAllSubeler();
		return inDB.stream().map(SubelerDTO::new).toList();
	}

}
