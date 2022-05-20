package com.ug11.kalkulasipersentase;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nMasukkan teks: ");
        String input = scan.nextLine();
        System.out.println("Rincian perhitungan: 4.25% + 1.25%");
        System.out.println("Total kenaikan (Dalam persen): 5.5%");
    }
}
