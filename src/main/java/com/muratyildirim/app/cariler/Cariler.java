package com.muratyildirim.app.cariler;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Cariler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Durum")
	private Byte durum = 0;

	@Column(name = "AnaHesapId")
	private Integer anaHesapId = 0;

	@Column(name = "Kodu", length = 20, nullable = false)
	private String kodu = "";

	@Column(name = "Adi", length = 30, nullable = false)
	private String adi = "";

	@Column(name = "Unvani", length = 80)
	private String unvani = "";

	@Column(name = "Yetkili", length = 20)
	private String yetkili = "";

	@Column(name = "DogumTarihi")
	private Date dogumTarihi = null;

	@Column(name = "Tipi")
	private Byte tipi = 0;

	@Column(name = "SubeId")
	private Short subeId = 1;

	@Column(name = "ParaBirimi", length = 3)
	private String paraBirimi = "TRY";

	@Column(name = "Aciklama", length = 500)
	private String aciklama = "";

	@Column(name = "MahalleId")
	private Integer mahalleId = 0;

	@Column(name = "FaturaAdresi", length = 500)
	private String faturaAdresi = "";

	@Column(name = "SevkAdresi", length = 500)
	private String sevkAdresi = "";

	@Column(name = "Telefon1", length = 15)
	private String telefon1 = "";

	@Column(name = "Telefon2", length = 15)
	private String telefon2 = "";

	@Column(name = "Faks", length = 15)
	private String faks = "";

	@Column(name = "GSM", length = 15)
	private String gsm = "";

	@Column(name = "EMail", length = 40)
	private String email = "";

	@Column(name = "WebAdresi", length = 30)
	private String webAdresi = "";

	@Column(name = "VergiDairesi", length = 20)
	private String vergiDairesi = "";

	@Column(name = "VergiNumarasi", length = 20)
	private String vergiNumarasi = "";

	@Column(name = "KrediLimiti")
	private BigDecimal krediLimiti = BigDecimal.ZERO;

	@Column(name = "AcikHesapLimiti")
	private BigDecimal acikHesapLimiti = BigDecimal.ZERO;

	@Column(name = "Opsiyon")
	private Short opsiyon = 0;

	@Column(name = "Iskonto")
	private BigDecimal iskonto = BigDecimal.ZERO;

	@Column(name = "GecikmeFaizi")
	private BigDecimal gecikmeFaizi = BigDecimal.ZERO;

	@Column(name = "AylikVade")
	private BigDecimal aylikVade = BigDecimal.ZERO;

	@Column(name = "SatisYapilmasin")
	private Boolean satisYapilmasin = false;

	@Column(name = "TahsilatYapilmasin")
	private Boolean tahsilatYapilmasin = false;

	@Column(name = "OzelKod1")
	private Integer ozelKod1 = 0;

	@Column(name = "OzelKod2")
	private Integer ozelKod2 = 0;

	@Column(name = "OzelKod3")
	private Integer ozelKod3 = 0;

	@Column(name = "Tarih")
	private Date tarih;

	@Column(name = "OrtalamaDevirTarihi")
	private Date ortalamaDevirTarihi = null;

	@Column(name = "ArtiPuan")
	private Byte artiPuan = 0;

	@Column(name = "OtomasyonDisi")
	private Boolean otomasyonDisi = false;

	@Column(name = "BorcHesapId")
	private Integer borcHesapId = 0;

	@Column(name = "AlacakHesapId")
	private Integer alacakHesapId = 0;

	@Column(name = "SatisFiyati")
	private Byte satisFiyati = 1;

	@Column(name = "IsYeri", length = 100)
	private String isYeri = "";

	@Column(name = "OzelKod0")
	private Integer ozelKod0 = 0;

	@Column(name = "IlceId")
	private Integer ilceId = 0;

	@Column(name = "EFaturaSenaryo")
	private Byte eFaturaSenaryo = 0;

	@Column(name = "GiderTipi")
	private Integer giderTipi = 0;

	@Column(name = "AdresId")
	private Integer adresId = 0;

	@Column(name = "UlkeId")
	private Short ulkeId = 0;

	@Column(name = "PostaKodu", length = 10)
	private String postaKodu = "";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte getDurum() {
		return durum;
	}

	public void setDurum(Byte durum) {
		this.durum = durum;
	}

	public Integer getAnaHesapId() {
		return anaHesapId;
	}

	public void setAnaHesapId(Integer anaHesapId) {
		this.anaHesapId = anaHesapId;
	}

	public String getKodu() {
		return kodu;
	}

	public void setKodu(String kodu) {
		this.kodu = kodu;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getUnvani() {
		return unvani;
	}

	public void setUnvani(String unvani) {
		this.unvani = unvani;
	}

	public String getYetkili() {
		return yetkili;
	}

	public void setYetkili(String yetkili) {
		this.yetkili = yetkili;
	}

	public Date getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public Byte getTipi() {
		return tipi;
	}

	public void setTipi(Byte tipi) {
		this.tipi = tipi;
	}

	public Short getSubeId() {
		return subeId;
	}

	public void setSubeId(Short subeId) {
		this.subeId = subeId;
	}

	public String getParaBirimi() {
		return paraBirimi;
	}

	public void setParaBirimi(String paraBirimi) {
		this.paraBirimi = paraBirimi;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public Integer getMahalleId() {
		return mahalleId;
	}

	public void setMahalleId(Integer mahalleId) {
		this.mahalleId = mahalleId;
	}

	public String getFaturaAdresi() {
		return faturaAdresi;
	}

	public void setFaturaAdresi(String faturaAdresi) {
		this.faturaAdresi = faturaAdresi;
	}

	public String getSevkAdresi() {
		return sevkAdresi;
	}

	public void setSevkAdresi(String sevkAdresi) {
		this.sevkAdresi = sevkAdresi;
	}

	public String getTelefon1() {
		return telefon1;
	}

	public void setTelefon1(String telefon1) {
		this.telefon1 = telefon1;
	}

	public String getTelefon2() {
		return telefon2;
	}

	public void setTelefon2(String telefon2) {
		this.telefon2 = telefon2;
	}

	public String getFaks() {
		return faks;
	}

	public void setFaks(String faks) {
		this.faks = faks;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebAdresi() {
		return webAdresi;
	}

	public void setWebAdresi(String webAdresi) {
		this.webAdresi = webAdresi;
	}

	public String getVergiDairesi() {
		return vergiDairesi;
	}

	public void setVergiDairesi(String vergiDairesi) {
		this.vergiDairesi = vergiDairesi;
	}

	public String getVergiNumarasi() {
		return vergiNumarasi;
	}

	public void setVergiNumarasi(String vergiNumarasi) {
		this.vergiNumarasi = vergiNumarasi;
	}

	public BigDecimal getKrediLimiti() {
		return krediLimiti;
	}

	public void setKrediLimiti(BigDecimal krediLimiti) {
		this.krediLimiti = krediLimiti;
	}

	public BigDecimal getAcikHesapLimiti() {
		return acikHesapLimiti;
	}

	public void setAcikHesapLimiti(BigDecimal acikHesapLimiti) {
		this.acikHesapLimiti = acikHesapLimiti;
	}

	public Short getOpsiyon() {
		return opsiyon;
	}

	public void setOpsiyon(Short opsiyon) {
		this.opsiyon = opsiyon;
	}

	public BigDecimal getIskonto() {
		return iskonto;
	}

	public void setIskonto(BigDecimal iskonto) {
		this.iskonto = iskonto;
	}

	public BigDecimal getGecikmeFaizi() {
		return gecikmeFaizi;
	}

	public void setGecikmeFaizi(BigDecimal gecikmeFaizi) {
		this.gecikmeFaizi = gecikmeFaizi;
	}

	public BigDecimal getAylikVade() {
		return aylikVade;
	}

	public void setAylikVade(BigDecimal aylikVade) {
		this.aylikVade = aylikVade;
	}

	public Boolean getSatisYapilmasin() {
		return satisYapilmasin;
	}

	public void setSatisYapilmasin(Boolean satisYapilmasin) {
		this.satisYapilmasin = satisYapilmasin;
	}

	public Boolean getTahsilatYapilmasin() {
		return tahsilatYapilmasin;
	}

	public void setTahsilatYapilmasin(Boolean tahsilatYapilmasin) {
		this.tahsilatYapilmasin = tahsilatYapilmasin;
	}

	public Integer getOzelKod1() {
		return ozelKod1;
	}

	public void setOzelKod1(Integer ozelKod1) {
		this.ozelKod1 = ozelKod1;
	}

	public Integer getOzelKod2() {
		return ozelKod2;
	}

	public void setOzelKod2(Integer ozelKod2) {
		this.ozelKod2 = ozelKod2;
	}

	public Integer getOzelKod3() {
		return ozelKod3;
	}

	public void setOzelKod3(Integer ozelKod3) {
		this.ozelKod3 = ozelKod3;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public Date getOrtalamaDevirTarihi() {
		return ortalamaDevirTarihi;
	}

	public void setOrtalamaDevirTarihi(Date ortalamaDevirTarihi) {
		this.ortalamaDevirTarihi = ortalamaDevirTarihi;
	}

	public Byte getArtiPuan() {
		return artiPuan;
	}

	public void setArtiPuan(Byte artiPuan) {
		this.artiPuan = artiPuan;
	}

	public Boolean getOtomasyonDisi() {
		return otomasyonDisi;
	}

	public void setOtomasyonDisi(Boolean otomasyonDisi) {
		this.otomasyonDisi = otomasyonDisi;
	}

	public Integer getBorcHesapId() {
		return borcHesapId;
	}

	public void setBorcHesapId(Integer borcHesapId) {
		this.borcHesapId = borcHesapId;
	}

	public Integer getAlacakHesapId() {
		return alacakHesapId;
	}

	public void setAlacakHesapId(Integer alacakHesapId) {
		this.alacakHesapId = alacakHesapId;
	}

	public Byte getSatisFiyati() {
		return satisFiyati;
	}

	public void setSatisFiyati(Byte satisFiyati) {
		this.satisFiyati = satisFiyati;
	}

	public String getIsYeri() {
		return isYeri;
	}

	public void setIsYeri(String isYeri) {
		this.isYeri = isYeri;
	}

	public Integer getOzelKod0() {
		return ozelKod0;
	}

	public void setOzelKod0(Integer ozelKod0) {
		this.ozelKod0 = ozelKod0;
	}

	public Integer getIlceId() {
		return ilceId;
	}

	public void setIlceId(Integer ilceId) {
		this.ilceId = ilceId;
	}

	public Byte geteFaturaSenaryo() {
		return eFaturaSenaryo;
	}

	public void seteFaturaSenaryo(Byte eFaturaSenaryo) {
		this.eFaturaSenaryo = eFaturaSenaryo;
	}

	public Integer getGiderTipi() {
		return giderTipi;
	}

	public void setGiderTipi(Integer giderTipi) {
		this.giderTipi = giderTipi;
	}

	public Integer getAdresId() {
		return adresId;
	}

	public void setAdresId(Integer adresId) {
		this.adresId = adresId;
	}

	public Short getUlkeId() {
		return ulkeId;
	}

	public void setUlkeId(Short ulkeId) {
		this.ulkeId = ulkeId;
	}

	public String getPostaKodu() {
		return postaKodu;
	}

	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
}
