package com.muratyildirim.app.yazicilar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YazicilarController {

  @Autowired
  YazicilarService yazicilarService;

  @GetMapping("/api/v1/yazicilar")
  List<Yazicilar> getAllYazicilar() {
    return yazicilarService.getAllYazicilar();
  }

}
