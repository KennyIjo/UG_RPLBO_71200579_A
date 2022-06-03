package com.ug13.sakitrumah;

import java.util.Random;

public class Pengunjung {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private String status = "False";

    public Pengunjung(String nama, int usia, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public int getLevelPenyakit() {
        return levelPenyakit;
    }

//    public void setLevelPenyakit(int levelPenyakit) {
//        levelPenyakit = ;
//    }
}
