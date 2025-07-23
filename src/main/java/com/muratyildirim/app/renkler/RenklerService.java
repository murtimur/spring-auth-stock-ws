package com.muratyildirim.app.renkler;

import org.springframework.stereotype.Service;

import com.muratyildirim.app.renkler.dto.RenklerDTO;
import com.muratyildirim.app.shared.ConvertModel;

@Service
public class RenklerService {

  RenklerRepository renklerRepository;
  ConvertModel convertModel;

  public RenklerService(RenklerRepository renklerRepository, ConvertModel convertModel) {
    this.renklerRepository = renklerRepository;
    this.convertModel = convertModel;
  }

  public RenklerDTO getRenk(Integer id) {
    Renkler inDB = renklerRepository.getRenk(id);
    return convertModel.convertObject(inDB, RenklerDTO.class);
  }

}
