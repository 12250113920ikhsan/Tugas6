package com.example.tugas6;

public class Model {
    private String namaClub;
    private int logoClub;

    public Model(String namaClub, int logoClub) {
        this.namaClub = namaClub;
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
}
