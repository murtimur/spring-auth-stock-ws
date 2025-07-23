package com.muratyildirim.app.cariler;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.muratyildirim.app.cariler.dto.CarilerDTO;
import com.muratyildirim.app.cariler.dto.CarilerSearchDTO;
import com.muratyildirim.app.shared.ConvertModel;

@Service
public class CarilerService {

	CarilerRepository carilerRepository;

	ConvertModel convertModel;

	public CarilerService(CarilerRepository carilerRepository, ConvertModel convertModel) {
		this.carilerRepository = carilerRepository;
		this.convertModel = convertModel;
	}

	// signup icin cari arama
	Page<CarilerDTO> findByAdiContainingAndDurum(String adi, Pageable pageable) {
		Page<Cariler> inDB = carilerRepository.findByAdiContainingAndDurum(adi, (byte) 0, pageable);
		return convertModel.convertPage(inDB, CarilerDTO.class);
	}

	// user default cari return eder
	CarilerDTO getUserDefaultCari(String kodu) {
		Cariler cari = carilerRepository.findByKodu(kodu);
		if (cari == null)
			return null;
		return convertModel.convertObject(cari, CarilerDTO.class);
	}

	// cari arama ozelKod3Id varsa ona gore yoksa sedece subeye gore
	Page<CarilerDTO> getCariSearch(CarilerSearchDTO cari, Pageable pageable) {
		Page<Cariler> resultPage = (cari.ozelKod3Id() != null && cari.ozelKod3Id() > 0)
				? carilerRepository.findByAdiContainingAndSubeIdAndOzelKod3AndDurum(cari.adi(), cari.subeId(),
						cari.ozelKod3Id(), (byte) 0, pageable)
				: carilerRepository.findByAdiContainingAndSubeIdAndDurum(cari.adi(), cari.subeId(), (byte) 0, pageable);
		return convertModel.convertPage(resultPage, CarilerDTO.class);
	}

}
