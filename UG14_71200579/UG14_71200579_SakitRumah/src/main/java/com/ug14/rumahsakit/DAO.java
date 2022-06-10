package com.ug14.rumahsakit;

public class DAO {
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private static Pasien pasien;

    public int getDokterByID(){
        return dokter.getIdDokter();
    }
    public int getSusterByID(){
        return suster.getIdSuster();
    }
    public int getPelayananByID(){
        return pelayanan.getIdPelayan();
    }
//    public Pasien inputPasien(){
//
//    }
//    public Jadwal inputJadwal(){
//
//    }
    public static int getPasienSembuh(){
        return 1;
    }
}
