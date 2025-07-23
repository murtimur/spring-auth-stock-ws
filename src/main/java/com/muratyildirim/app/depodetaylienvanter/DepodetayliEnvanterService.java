package com.muratyildirim.app.depodetaylienvanter;

import org.springframework.stereotype.Service;

import com.muratyildirim.app.depodetaylienvanter.dto.DepodetayliEnvanterDTO;
import com.muratyildirim.app.shared.ConvertModel;

@Service
public class DepodetayliEnvanterService {

	DepodetayliEnvanterRepository depodetayliEnvanterRepository;

	ConvertModel convertModel;

	public DepodetayliEnvanterService(DepodetayliEnvanterRepository depodetayliEnvanterRepository,
			ConvertModel convertModel) {
		this.depodetayliEnvanterRepository = depodetayliEnvanterRepository;
		this.convertModel = convertModel;
	}

	public DepodetayliEnvanterDTO getEnvanter(Integer stokId, Short subeId) {
		DepodetayliEnvanter inDB = depodetayliEnvanterRepository.findByStokIdAndSubeId(stokId, subeId);
		if (inDB == null)
			return null;
		return convertModel.convertObject(inDB, DepodetayliEnvanterDTO.class);
	}

}
