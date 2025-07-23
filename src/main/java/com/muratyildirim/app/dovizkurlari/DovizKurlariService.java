package com.muratyildirim.app.dovizkurlari;

import org.springframework.stereotype.Service;

import com.muratyildirim.app.dovizkurlari.dto.DovizKurlariDTO;
import com.muratyildirim.app.shared.ConvertModel;

import java.time.LocalDateTime;

@Service
public class DovizKurlariService {

  DovizKurlariRepository dovizKurlariRepository;
  ConvertModel convertModel;

  public DovizKurlariService(DovizKurlariRepository dovizKurlariRepository,
                             ConvertModel convertModel) {
    this.dovizKurlariRepository = dovizKurlariRepository;
    this.convertModel = convertModel;
  }

  DovizKurlariDTO getDovizKuru(String doviz) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime date = now.toLocalDate().atStartOfDay();
    DovizKurlari inDB = dovizKurlariRepository.findByTarihAndDoviz(date, doviz);
    if (inDB == null) return null;
    return convertModel.convertObject(inDB, DovizKurlariDTO.class);
  }

}
