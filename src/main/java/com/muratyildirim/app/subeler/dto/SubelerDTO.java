package com.muratyildirim.app.subeler.dto;

import com.muratyildirim.app.subeler.Subeler;

public class SubelerDTO {

	private Integer id;

	private String adi;

	private String kodu;

	public SubelerDTO(Subeler subeler) {
		this.id = subeler.getId();
		this.adi = subeler.getAdi();
		this.kodu = subeler.getKodu();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getKodu() {
		return kodu;
	}

	public void setKodu(String kodu) {
		this.kodu = kodu;
	}

}
