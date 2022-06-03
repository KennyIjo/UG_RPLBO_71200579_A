package com.ug13.sakitrumah;

public class Jadwal {
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public Jadwal() {

    }

    public Pengunjung getPengunjung() {
        Pengunjung pengunjung = this.pengunjung;
        return pengunjung;
    }
}
