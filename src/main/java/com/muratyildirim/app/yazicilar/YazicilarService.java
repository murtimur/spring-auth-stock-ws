package com.muratyildirim.app.yazicilar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YazicilarService {

  @Autowired
  YazicilarRepository yazicilarRepository;

  List<Yazicilar> getAllYazicilar() {
    return yazicilarRepository.getAllYazicilar();
  }

}
