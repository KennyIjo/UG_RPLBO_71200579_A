import java.util.Date;
import java.util.Scanner;

public class UG3Soal1 {
    public static void main(String[] args){
        int tanggal, bulan, tahun, jam, menit, detik;
        String nama, namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        Scanner keyboard = new Scanner(System.in);
        Date date = new Date();
        tanggal = date.getDate();
        bulan = date.getMonth();
        tahun = date.getYear() + 1900;
        jam = date.getHours();
        menit = date.getMinutes();
        detik = date.getSeconds();


        System.out.println("========== Absensi Karyawan ==========");
        System.out.println("Absen Disini");
        System.out.print("Nama Karyawan : ");
        nama = keyboard.nextLine();
        System.out.println("");
        System.out.println("Berhasil absensi");
        System.out.println("Atas Nama : " + nama);
        System.out.println("Pada tanggal : " + tanggal + " " + namabulan[bulan] + " " + tahun);
        System.out.println("Pukul : " + jam + ":" + menit + ":" + detik);
    }
}
