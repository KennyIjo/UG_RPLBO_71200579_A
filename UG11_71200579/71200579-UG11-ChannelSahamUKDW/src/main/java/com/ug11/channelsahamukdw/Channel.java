package com.ug11.channelsahamukdw;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag;

    public Channel(){
        namaDepan = "albertus";
        namaBelakang = "adrian";
        email = "albertus.adrian@students.ukdw.ac.id";
        totalTag = 0;
    }
    public void login(String email){
        this.email = email;
        boolean ok = true;

        try{
            if(!email.contains("@students.ukdw.ac.id")){
                ok = false;
                throw new EmailException(1);
//            } else if(email.contentEquals(namaDepan) && email.contentEquals(namaBelakang)){
//                ok = false;
//                throw new EmailException(2);
            }
        } catch (EmailException e) {
            System.out.println(e.getErrorMessage());
        }
        if(ok){
            System.out.println("Login berhasil!");
        }
    }

    public void bagikanIde(String ide){
        System.out.println("Ide: " + ide);
        if(!ide.contains("#")){
            System.out.println("Saham yang Anda tag: -");
            System.out.println("Total saham yang Anda tag: 0");
        } else{
            totalTag += 1;
            System.out.println("Saham yang Anda tag: " + ide.contentEquals("#"));
            System.out.println("Total saham yang Anda tag: " + totalTag);
        }
    }

    public void printInfo() {
        System.out.println("Nama Depan: " + namaDepan.toUpperCase());
        System.out.println("Nama Belakang: " + namaBelakang.toUpperCase());
        System.out.println("Email: " + email);
        System.out.println("Total Tag: " + totalTag);
    }
}
