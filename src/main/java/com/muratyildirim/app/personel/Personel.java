package com.muratyildirim.app.personel;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Short id;

	@Column(name = "Durum")
	private Short durum;

	@Column(name = "SubeId")
	private Byte subeId;

	@Column(name = "Kodu")
	private String kodu;

	@Column(name = "TCKimlikNo")
	private String tcKimlikNo;

	@Column(name = "Adi")
	private String adi;

	@Column(name = "Soyadi")
	private String soyadi;

	@Column(name = "Prim")
	private BigDecimal prim;

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
