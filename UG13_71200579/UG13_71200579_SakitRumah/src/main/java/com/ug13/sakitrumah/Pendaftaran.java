package com.ug13.sakitrumah;

import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    Scanner input = new Scanner(System.in);

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal) {
        if(pengunjung.getStatus() == "False") {
            System.out.println("================Proses Pengaturan Jadwal Berhasil================");
        }
    }

    public Pengunjung registrasi() {
        System.out.print("Masukkan nama anda: ");
        String namaP = input.nextLine();
        System.out.print("Masukkan usia anda: ");
        int usiaP = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan alamat anda: ");
        String alamatP = input.nextLine();
        System.out.print("Masukkan penyakit anda: ");
        String penyakitP = input.nextLine();
        Pengunjung pengunjung = new Pengunjung(namaP, usiaP, alamatP);
        System.out.println("===============Proses Registrasi berhasil===============");
        return pengunjung;
    }
}
