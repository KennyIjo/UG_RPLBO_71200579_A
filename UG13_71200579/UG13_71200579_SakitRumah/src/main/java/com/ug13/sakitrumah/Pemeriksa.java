package com.ug13.sakitrumah;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }
    public void cekStatus(Pengunjung pengunjung) {
        if(pengunjung.getLevelPenyakit() != 0) {
            System.out.println("===============PASIEN ANDA MASIH SAKIT===============");
//            pengunjung.getLevelPenyakit()--;
        } else {
            System.out.println("===============SELAMAT PASIEN ANDA SUDAH SEHAT DAN SEMBUH===============");
//            pengunjung.getStatus() = "True";
        }
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal) {

    }
}
