package com.muratyildirim.app.subeler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.app.subeler.dto.SubelerDTO;

@RestController
public class SubelerController {
	
	@Autowired
	SubelerService subelerService;
	
	@GetMapping("/api/v1/subeler")
	List<SubelerDTO> getAllSubeler() {
		return subelerService.getAllSubeler();
	}

}
