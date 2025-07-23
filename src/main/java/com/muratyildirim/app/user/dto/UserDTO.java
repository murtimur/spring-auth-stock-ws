package com.muratyildirim.app.user.dto;

import com.muratyildirim.app.user.User;

public class UserDTO {

	private Integer id;
	private String fiyatTipleri;
	private String kasaId;
	private String subeId;
	private String username;
	private String varsayilanCariKodu;
	private String varsayilanPersonelKodu;
	private String belgeDizayn;
	private String belgeHarfi;
	private String alan1;
	private String alan2;
	private String alan3;
	private String alan4;
	private String alan5;
	private String alan6;
	private String alan7;
	private String alan8;
	private String alan9;
	private String alan10;
	private String barkodDizayni;
	private String barkodYaziciAdi;
	private String yaziciAdi;
	private boolean alinanSiparis;
	private boolean alisFaturasi;
	private boolean alisIadeFaturasi;
	private boolean cariKartAcar;
	private boolean depoTransfer;
	private boolean fisListelesin;
	private boolean fisSiler;
	private boolean fiseGirebilsin;
	private boolean fiyatDegistirir;
	private boolean iskontoYapabilir;
	private boolean kdvKullanilacak;
	private boolean sabitFiyat;
	private boolean satisFaturasi;
	private boolean satisIadeFaturasi;
	private boolean sayim;
	private boolean stokCikisBelgesi;
	private boolean stokGirisBelgesi;
	private boolean verilenSiparis;
	private float kdvOrani;
	private int pesinVadeli;
	private short nushaAdet;
	private Long ozelKod3Id;
	private boolean bakiyeGorsun;
	private boolean alinanFiyatTeklifi;
	private boolean verilenFiyatTeklifi;
	private String renkBeden;
	private boolean sayimEnvanterGorur;

	public UserDTO(User user) {
		this.id = user.getId();
		this.fiyatTipleri = user.getFiyatTipleri();
		this.kasaId = user.getKasaId();
		this.subeId = user.getSubeId();
		this.username = user.getUsername();
		this.varsayilanCariKodu = user.getVarsayilanCariKodu();
		this.varsayilanPersonelKodu = user.getVarsayilanPersonelKodu();
		this.belgeDizayn = user.getBelgeDizayn();
		this.belgeHarfi = user.getBelgeHarfi();
		this.alan1 = user.getAlan1();
		this.alan2 = user.getAlan2();
		this.alan3 = user.getAlan3();
		this.alan4 = user.getAlan4();
		this.alan5 = user.getAlan5();
		this.alan6 = user.getAlan6();
		this.alan7 = user.getAlan7();
		this.alan8 = user.getAlan8();
		this.alan9 = user.getAlan9();
		this.alan10 = user.getAlan10();
		this.barkodDizayni = user.getBarkodDizayni();
		this.barkodYaziciAdi = user.getBarkodYaziciAdi();
		this.yaziciAdi = user.getYaziciAdi();
		this.alinanSiparis = user.isAlinanSiparis();
		this.alisFaturasi = user.isAlisFaturasi();
		this.alisIadeFaturasi = user.isAlisIadeFaturasi();
		this.cariKartAcar = user.isCariKartAcar();
		this.depoTransfer = user.isDepoTransfer();
		this.fisListelesin = user.isFisListelesin();
		this.fisSiler = user.isFisSiler();
		this.fiseGirebilsin = user.isFiseGirebilsin();
		this.fiyatDegistirir = user.isFiyatDegistirir();
		this.iskontoYapabilir = user.isIskontoYapabilir();
		this.kdvKullanilacak = user.isKdvKullanilacak();
		this.sabitFiyat = user.isSabitFiyat();
		this.satisFaturasi = user.isSatisFaturasi();
		this.satisIadeFaturasi = user.isSatisIadeFaturasi();
		this.sayim = user.isSayim();
		this.stokCikisBelgesi = user.isStokCikisBelgesi();
		this.stokGirisBelgesi = user.isStokGirisBelgesi();
		this.verilenSiparis = user.isVerilenSiparis();
		this.kdvOrani = user.getKdvOrani();
		this.pesinVadeli = user.getPesinVadeli();
		this.nushaAdet = user.getNushaAdet();
		this.ozelKod3Id = user.getOzelKod3Id();
		this.bakiyeGorsun = user.isBakiyeGorsun();
		this.alinanFiyatTeklifi = user.isAlinanFiyatTeklifi();
		this.verilenFiyatTeklifi = user.isVerilenFiyatTeklifi();
		this.sayimEnvanterGorur = user.isSayimEnvanterGorur();
		this.renkBeden = user.getRenkBeden();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFiyatTipleri() {
		return fiyatTipleri;
	}

	public void setFiyatTipleri(String fiyatTipleri) {
		this.fiyatTipleri = fiyatTipleri;
	}

	public String getKasaId() {
		return kasaId;
	}

	public void setKasaId(String kasaId) {
		this.kasaId = kasaId;
	}

	public String getSubeId() {
		return subeId;
	}

	public void setSubeId(String subeId) {
		this.subeId = subeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVarsayilanCariKodu() {
		return varsayilanCariKodu;
	}

	public void setVarsayilanCariKodu(String varsayilanCariKodu) {
		this.varsayilanCariKodu = varsayilanCariKodu;
	}

	public String getVarsayilanPersonelKodu() {
		return varsayilanPersonelKodu;
	}

	public void setVarsayilanPersonelKodu(String varsayilanPersonelKodu) {
		this.varsayilanPersonelKodu = varsayilanPersonelKodu;
	}

	public String getBelgeDizayn() {
		return belgeDizayn;
	}

	public void setBelgeDizayn(String belgeDizayn) {
		this.belgeDizayn = belgeDizayn;
	}

	public String getBelgeHarfi() {
		return belgeHarfi;
	}

	public void setBelgeHarfi(String belgeHarfi) {
		this.belgeHarfi = belgeHarfi;
	}

	public String getAlan1() {
		return alan1;
	}

	public void setAlan1(String alan1) {
		this.alan1 = alan1;
	}

	public String getAlan2() {
		return alan2;
	}

	public void setAlan2(String alan2) {
		this.alan2 = alan2;
	}

	public String getAlan3() {
		return alan3;
	}

	public void setAlan3(String alan3) {
		this.alan3 = alan3;
	}

	public String getAlan4() {
		return alan4;
	}

	public void setAlan4(String alan4) {
		this.alan4 = alan4;
	}

	public String getAlan5() {
		return alan5;
	}

	public void setAlan5(String alan5) {
		this.alan5 = alan5;
	}

	public String getAlan6() {
		return alan6;
	}

	public void setAlan6(String alan6) {
		this.alan6 = alan6;
	}

	public String getAlan7() {
		return alan7;
	}

	public void setAlan7(String alan7) {
		this.alan7 = alan7;
	}

	public String getAlan8() {
		return alan8;
	}

	public void setAlan8(String alan8) {
		this.alan8 = alan8;
	}

	public String getAlan9() {
		return alan9;
	}

	public void setAlan9(String alan9) {
		this.alan9 = alan9;
	}

	public String getAlan10() {
		return alan10;
	}

	public void setAlan10(String alan10) {
		this.alan10 = alan10;
	}

	public String getBarkodDizayni() {
		return barkodDizayni;
	}

	public void setBarkodDizayni(String barkodDizayni) {
		this.barkodDizayni = barkodDizayni;
	}

	public String getBarkodYaziciAdi() {
		return barkodYaziciAdi;
	}

	public void setBarkodYaziciAdi(String barkodYaziciAdi) {
		this.barkodYaziciAdi = barkodYaziciAdi;
	}

	public String getYaziciAdi() {
		return yaziciAdi;
	}

	public void setYaziciAdi(String yaziciAdi) {
		this.yaziciAdi = yaziciAdi;
	}

	public boolean isAlinanSiparis() {
		return alinanSiparis;
	}

	public void setAlinanSiparis(boolean alinanSiparis) {
		this.alinanSiparis = alinanSiparis;
	}

	public boolean isAlisFaturasi() {
		return alisFaturasi;
	}

	public void setAlisFaturasi(boolean alisFaturasi) {
		this.alisFaturasi = alisFaturasi;
	}

	public boolean isAlisIadeFaturasi() {
		return alisIadeFaturasi;
	}

	public void setAlisIadeFaturasi(boolean alisIadeFaturasi) {
		this.alisIadeFaturasi = alisIadeFaturasi;
	}

	public boolean isCariKartAcar() {
		return cariKartAcar;
	}

	public void setCariKartAcar(boolean cariKartAcar) {
		this.cariKartAcar = cariKartAcar;
	}

	public boolean isDepoTransfer() {
		return depoTransfer;
	}

	public void setDepoTransfer(boolean depoTransfer) {
		this.depoTransfer = depoTransfer;
	}

	public boolean isFisListelesin() {
		return fisListelesin;
	}

	public void setFisListelesin(boolean fisListelesin) {
		this.fisListelesin = fisListelesin;
	}

	public boolean isFisSiler() {
		return fisSiler;
	}

	public void setFisSiler(boolean fisSiler) {
		this.fisSiler = fisSiler;
	}

	public boolean isFiseGirebilsin() {
		return fiseGirebilsin;
	}

	public void setFiseGirebilsin(boolean fiseGirebilsin) {
		this.fiseGirebilsin = fiseGirebilsin;
	}

	public boolean isFiyatDegistirir() {
		return fiyatDegistirir;
	}

	public void setFiyatDegistirir(boolean fiyatDegistirir) {
		this.fiyatDegistirir = fiyatDegistirir;
	}

	public boolean isIskontoYapabilir() {
		return iskontoYapabilir;
	}

	public void setIskontoYapabilir(boolean iskontoYapabilir) {
		this.iskontoYapabilir = iskontoYapabilir;
	}

	public boolean isKdvKullanilacak() {
		return kdvKullanilacak;
	}

	public void setKdvKullanilacak(boolean kdvKullanilacak) {
		this.kdvKullanilacak = kdvKullanilacak;
	}

	public boolean isSabitFiyat() {
		return sabitFiyat;
	}

	public void setSabitFiyat(boolean sabitFiyat) {
		this.sabitFiyat = sabitFiyat;
	}

	public boolean isSatisFaturasi() {
		return satisFaturasi;
	}

	public void setSatisFaturasi(boolean satisFaturasi) {
		this.satisFaturasi = satisFaturasi;
	}

	public boolean isSatisIadeFaturasi() {
		return satisIadeFaturasi;
	}

	public void setSatisIadeFaturasi(boolean satisIadeFaturasi) {
		this.satisIadeFaturasi = satisIadeFaturasi;
	}

	public boolean isSayim() {
		return sayim;
	}

	public void setSayim(boolean sayim) {
		this.sayim = sayim;
	}

	public boolean isStokCikisBelgesi() {
		return stokCikisBelgesi;
	}

	public void setStokCikisBelgesi(boolean stokCikisBelgesi) {
		this.stokCikisBelgesi = stokCikisBelgesi;
	}

	public boolean isStokGirisBelgesi() {
		return stokGirisBelgesi;
	}

	public void setStokGirisBelgesi(boolean stokGirisBelgesi) {
		this.stokGirisBelgesi = stokGirisBelgesi;
	}

	public boolean isVerilenSiparis() {
		return verilenSiparis;
	}

	public void setVerilenSiparis(boolean verilenSiparis) {
		this.verilenSiparis = verilenSiparis;
	}

	public float getKdvOrani() {
		return kdvOrani;
	}

	public void setKdvOrani(float kdvOrani) {
		this.kdvOrani = kdvOrani;
	}

	public int getPesinVadeli() {
		return pesinVadeli;
	}

	public void setPesinVadeli(int pesinVadeli) {
		this.pesinVadeli = pesinVadeli;
	}

	public short getNushaAdet() {
		return nushaAdet;
	}

	public void setNushaAdet(short nushaAdet) {
		this.nushaAdet = nushaAdet;
	}

	public Long getOzelKod3Id() {
		return ozelKod3Id;
	}

	public void setOzelKod3Id(Long ozelKod3Id) {
		this.ozelKod3Id = ozelKod3Id;
	}

	public boolean isBakiyeGorsun() {
		return bakiyeGorsun;
	}

	public void setBakiyeGorsun(boolean bakiyeGorsun) {
		this.bakiyeGorsun = bakiyeGorsun;
	}

	public boolean isAlinanFiyatTeklifi() {
		return alinanFiyatTeklifi;
	}

	public void setAlinanFiyatTeklifi(boolean alinanFiyatTeklifi) {
		this.alinanFiyatTeklifi = alinanFiyatTeklifi;
	}

	public boolean isVerilenFiyatTeklifi() {
		return verilenFiyatTeklifi;
	}

	public void setVerilenFiyatTeklifi(boolean verilenFiyatTeklifi) {
		this.verilenFiyatTeklifi = verilenFiyatTeklifi;
	}

	public String getRenkBeden() {
		return renkBeden;
	}

	public void setRenkBeden(String renkBeden) {
		this.renkBeden = renkBeden;
	}

	public boolean isSayimEnvanterGorur() {
		return sayimEnvanterGorur;
	}

	public void setSayimEnvanterGorur(boolean sayimEnvanterGorur) {
		this.sayimEnvanterGorur = sayimEnvanterGorur;
	}
}
