package com.muratyildirim.app.user.dto;

import com.muratyildirim.app.user.User;

import jakarta.validation.constraints.NotBlank;

public record UserCreateDTO(String fiyatTipleri, @NotBlank String kasaId, @NotBlank String subeId,
		@NotBlank String username, @NotBlank String password, String varsayilanCariKodu, String varsayilanPersonelKodu,
		String belgeDizayn, @NotBlank String belgeHarfi, String alan1, String alan2,
		String alan3, String alan4, String alan5, String alan6, String alan7, String alan8, String alan9, String alan10,
		String barkodDizayni, String barkodYaziciAdi, String yaziciAdi, boolean alinanSiparis, boolean alisFaturasi,
		boolean alisIadeFaturasi, boolean cariKartAcar, boolean depoTransfer, boolean fisListelesin, boolean fisSiler,
		boolean fiseGirebilsin, boolean fiyatDegistirir, boolean iskontoYapabilir, boolean kdvKullanilacak,
		boolean sabitFiyat, boolean satisFaturasi, boolean satisIadeFaturasi, boolean sayim, boolean stokCikisBelgesi,
		boolean stokGirisBelgesi, boolean verilenSiparis, float kdvOrani, int pesinVadeli, short nushaAdet,
		Long ozelKod3Id, boolean bakiyeGorsun, boolean alinanFiyatTeklifi,
														boolean verilenFiyatTeklifi) {

	public User toUser() {
		User user = new User();
		user.setAlan1(alan1);
		user.setAlan2(alan2);
		user.setAlan3(alan3);
		user.setAlan4(alan4);
		user.setAlan5(alan5);
		user.setAlan6(alan6);
		user.setAlan7(alan7);
		user.setAlan8(alan8);
		user.setAlan9(alan9);
		user.setAlan10(alan10);
		user.setBarkodDizayni(barkodDizayni);
		user.setBarkodYaziciAdi(barkodYaziciAdi);
		user.setBelgeHarfi(belgeHarfi);
		user.setFiyatTipleri(fiyatTipleri);
		user.setKasaId(kasaId);
		user.setSubeId(subeId);
		user.setUsername(username);
		user.setPassword(password);
		user.setVarsayilanCariKodu(varsayilanCariKodu);
		user.setVarsayilanPersonelKodu(varsayilanPersonelKodu);
		user.setYaziciAdi(yaziciAdi);
		user.setAlinanSiparis(alinanSiparis);
		user.setAlisFaturasi(alisFaturasi);
		user.setAlisIadeFaturasi(alisIadeFaturasi);
		user.setCariKartAcar(cariKartAcar);
		user.setDepoTransfer(depoTransfer);
		user.setFisListelesin(fisListelesin);
		user.setFisSiler(fisSiler);
		user.setFiseGirebilsin(fiseGirebilsin);
		user.setFiyatDegistirir(fiyatDegistirir);
		user.setIskontoYapabilir(iskontoYapabilir);
		user.setKdvKullanilacak(kdvKullanilacak);
		user.setSabitFiyat(sabitFiyat);
		user.setSatisFaturasi(satisFaturasi);
		user.setSatisIadeFaturasi(satisIadeFaturasi);
		user.setSayim(sayim);
		user.setStokCikisBelgesi(stokCikisBelgesi);
		user.setStokGirisBelgesi(stokGirisBelgesi);
		user.setVerilenSiparis(verilenSiparis);
		user.setKdvOrani(kdvOrani);
		user.setPesinVadeli(pesinVadeli);
		user.setNushaAdet(nushaAdet);
		user.setOzelKod3Id(ozelKod3Id);
		user.setBakiyeGorsun(bakiyeGorsun);
		user.setBelgeDizayn(belgeDizayn);
		user.setAlinanFiyatTeklifi(alinanFiyatTeklifi);
		user.setAlinanFiyatTeklifi(alinanFiyatTeklifi);
		return user;
	}

}
