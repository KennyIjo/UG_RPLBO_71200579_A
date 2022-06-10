package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayan;
    private String nama;

    Scanner input = new Scanner(System.in);

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal) {
        if(pasien.getStatus() == false) {
            System.out.println("================Proses Pengaturan Jadwal Berhasil================");
        }
    }

    public Pasien registrasi() {
        System.out.print("Masukkan rm baru: ");
        int rmP = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan nama anda: ");
        String namaP = input.nextLine();
        System.out.print("Masukkan usia anda: ");
        int usiaP = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan alamat anda: ");
        String alamatP = input.nextLine();
        System.out.print("Masukkan penyakit anda: ");
        String penyakitP = input.nextLine();
        Pasien pasien = new Pasien(namaP, usiaP, alamatP);
        System.out.println("===============Proses Registrasi berhasil===============");
        return pasien;
    }

    public int getIdPelayan() {
        return idPelayan;
    }
}
