package com.muratyildirim.app.dovizkurlari;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class DovizKurlari {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Integer id;

  @Column(length = 3, nullable = false, name = "Doviz")
  private String doviz;

  @Column(nullable = false, name = "Tarih")
  private LocalDateTime tarih;

  @Column(precision = 18, scale = 8, nullable = false, name = "Kur")
  private BigDecimal kur;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

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
