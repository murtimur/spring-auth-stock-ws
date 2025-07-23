package com.muratyildirim.app.ozelkodlar;

import jakarta.persistence.*;

@Entity
public class OzelKodlar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Kod")
    private String kod;

    @Column(name = "KodNo")
    private byte kodNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public byte getKodNo() {
        return kodNo;
    }

    public void setKodNo(byte kodNo) {
        this.kodNo = kodNo;
    }
}
