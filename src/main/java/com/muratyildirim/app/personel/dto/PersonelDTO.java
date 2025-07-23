package com.muratyildirim.app.personel.dto;

import java.math.BigDecimal;

import com.muratyildirim.app.personel.Personel;

public class PersonelDTO {

	private Short id;

	private Short durum;

	private Byte subeId;

	private String kodu;

	private String tcKimlikNo;

	private String adi;

	private String soyadi;

	private BigDecimal prim;	

	public PersonelDTO() {
	}

	public PersonelDTO(Personel personel) {
		this.id = personel.getId();
		this.durum = personel.getDurum();
		this.subeId = personel.getSubeId();
		this.kodu = personel.getKodu();
		this.tcKimlikNo = personel.getTcKimlikNo();
		this.adi = personel.getAdi();
		this.soyadi = personel.getSoyadi();
		this.prim = personel.getPrim();
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Short getDurum() {
		return durum;
	}

	public void setDurum(Short durum) {
		this.durum = durum;
	}

	public Byte getSubeId() {
		return subeId;
	}

	public void setSubeId(Byte subeId) {
		this.subeId = subeId;
	}

	public String getKodu() {
		return kodu;
	}

	public void setKodu(String kodu) {
		this.kodu = kodu;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public BigDecimal getPrim() {
		return prim;
	}

	public void setPrim(BigDecimal prim) {
		this.prim = prim;
	}
}
