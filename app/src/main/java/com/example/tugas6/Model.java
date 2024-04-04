package com.example.tugas6;

public class Model {
    private String namaClub;
    private String tahunBerdiri;
    private String asalNegara;
    private int logoClub;
    private int id;

    public Model(String namaClub, String tahunBerdiri, String asalNegara, int logoClub) {
        this.id = id;
        this.namaClub = namaClub;
        this.tahunBerdiri = tahunBerdiri;
        this.asalNegara = asalNegara;
        this.logoClub = logoClub;
    }

    public String getNamaClub() {

        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    public int getLogoClub() {
        return logoClub;
    }

    public void setLogoClub(int logoClub) {
        this.logoClub = logoClub;
    }

    public String getSince() {
        return tahunBerdiri;
    }

    public void setSince(String since) {
        this.tahunBerdiri = since;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsalNegara(){
        return asalNegara;
    }
    public void setAsalNegara(String asalNegara){
        this.asalNegara = asalNegara;
    }
}