package com.muratyildirim.app.dovizkurlari.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DovizKurlariDTO {

  private String doviz;
  private LocalDateTime tarih;
  private BigDecimal kur;

  public String getDoviz() {
    return doviz;
  }

  public void setDoviz(String doviz) {
    this.doviz = doviz;
  }

  public LocalDateTime getTarih() {
    return tarih;
  }

  public void setTarih(LocalDateTime tarih) {
    this.tarih = tarih;
  }

  public BigDecimal getKur() {
    return kur;
  }

  public void setKur(BigDecimal kur) {
    this.kur = kur;
  }
}
