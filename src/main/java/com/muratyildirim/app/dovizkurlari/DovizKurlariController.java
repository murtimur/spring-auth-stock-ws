package com.muratyildirim.app.dovizkurlari;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.app.dovizkurlari.dto.DovizKurlariDTO;

@RestController
public class DovizKurlariController {

  DovizKurlariService dovizKurlariService;

  public DovizKurlariController(DovizKurlariService dovizKurlariService) {
    this.dovizKurlariService = dovizKurlariService;
  }

  @GetMapping("/api/v1/kur/{doviz}")
  DovizKurlariDTO getDovizKuru(@PathVariable String doviz) {
    return dovizKurlariService.getDovizKuru(doviz);
  }

}
