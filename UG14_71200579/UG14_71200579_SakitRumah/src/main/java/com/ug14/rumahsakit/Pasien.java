package com.ug14.rumahsakit;

public class Pasien {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private boolean status = false;

    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
    }

    public boolean getStatus() {
        return status;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

    public int getRm() {
        return rm;
    }
}
