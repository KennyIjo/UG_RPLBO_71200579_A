package com.ug5b.soal2;

public class Buku {
    private String kode;
    private int nextNum;
    private String judul;
    private String penulis;
    private long harga;
    private int stok;

    public static void main(String[] args) {}
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void setHarga(long harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public String getKode() {
        return kode;
    }
    public String getJudul() {
        return judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public long getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
}
