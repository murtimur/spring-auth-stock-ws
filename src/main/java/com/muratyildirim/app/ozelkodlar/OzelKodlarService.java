package com.muratyildirim.app.ozelkodlar;

import org.springframework.stereotype.Service;

import com.muratyildirim.app.ozelkodlar.dto.OzelKodlarDTO;
import com.muratyildirim.app.shared.ConvertModel;

import java.util.List;

@Service
public class OzelKodlarService {

    private OzelKodlarRepository ozelKodlarRepository;
    private ConvertModel convertModel;

    public OzelKodlarService(OzelKodlarRepository ozelKodlarRepository, ConvertModel convertModel) {
        this.ozelKodlarRepository = ozelKodlarRepository;
        this.convertModel = convertModel;
    }

    List<OzelKodlarDTO> getOzelKod3() {
        List<OzelKodlar> inDB = ozelKodlarRepository.findByKodNo((byte) 3);
        return convertModel.convertList(inDB, OzelKodlarDTO.class);
    }

}
