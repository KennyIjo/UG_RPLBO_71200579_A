package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }
    public void cekStatus(Pasien Pasien) {
        if(Pasien.getLevelPenyakit() != 0) {
            System.out.println("===============PASIEN ANDA MASIH SAKIT===============");
//            Pasien.getLevelPenyakit()--;
        } else {
            System.out.println("===============SELAMAT PASIEN ANDA SUDAH SEHAT DAN SEMBUH===============");
//            Pasien.getStatus() = "True";
        }
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal) {

    }

    public int getIdDokter() {
        return idDokter;
    }
}
