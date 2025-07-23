package com.muratyildirim.app.kasalar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.app.kasalar.dto.KasalarDTO;

@RestController
public class KasalarController {
	
	@Autowired
	KasalarService kasalarService;
	
	@GetMapping("/api/v1/kasalar")
	List<KasalarDTO> getAllKasalar() {
		return kasalarService.getAllKasalar();
	}

}
