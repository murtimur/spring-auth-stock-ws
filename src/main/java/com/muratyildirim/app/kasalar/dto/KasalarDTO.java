package com.muratyildirim.app.kasalar.dto;

import com.muratyildirim.app.kasalar.Kasalar;

public class KasalarDTO {
	
	private Integer id;
	
	private String adi;
	
	private String kodu;
	
	public KasalarDTO(Kasalar kasalar) {
		this.id = kasalar.getId();
		this.adi = kasalar.getAdi();
		this.kodu = kasalar.getKodu();
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
