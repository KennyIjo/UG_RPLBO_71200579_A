package com.ug12.aplikasistockbit;

import java.util.ArrayList;
import java.util.HashMap;

public class Stockbit {
    private ArrayList<Investor> arrInvestor;
    private Investor investor;
    Saham saham;
    public Stockbit() {

    }

    public void register(Investor investor) {
        ArrayList<Investor> arrInvestor = new ArrayList<Investor>();
        arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama " + investor.getNama() + " sukses");
    }

    public void login(String username, String password) {
        if(!username.equals(arrInvestor) || !password.equals(arrInvestor)) {
            System.out.println("Username/password Anda salah!");
        } else if(username.equals(arrInvestor) && password.equals(arrInvestor)){
            System.out.println("Login berhasil!");
            this.investor = investor;
        }
    }

    public void orderBeli(Saham saham, int lot) {
        HashMap<Saham, Integer> portfolio = new HashMap<Saham, Integer>();
        portfolio.put(saham, lot) ;
        System.out.println("Order beli " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
    }

    public void orderJual(Saham saham, int lot) {
        HashMap<Saham, Integer> portfolio = investor.getPortfolio();
        if(lot == portfolio.get(lot)) {
            portfolio.remove(saham, lot);
            System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " sukses!");
        } else if(lot < portfolio.get(lot)) {
            portfolio.replace(saham, lot-lot);
//             investor.getPortfolio(int) = investor.getPortfolio(int) - lot;
            System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " sukses!");
        } else{
            System.out.println("Order jual gagal!");
        }
    }

    public void printPortfolio() {
        HashMap<Saham, Integer> portfolio = new HashMap<Saham, Integer>();
        System.out.println("==========Portfolio Client==========");
        System.out.println("Client: " + investor.getNama());
        System.out.println("No.\tKode Saham\tJumlah Lot\tHarga\tSub Total");
        int no = 1;
        int lot = 1;

        int subTotal = portfolio.get(saham.getHarga()) * lot;
        int total = subTotal + subTotal;
        System.out.println(no + ".\t" + portfolio.get(saham.getKode()) + "\t" + portfolio.get(lot) + "x\t" + portfolio.get(saham.getHarga()) + subTotal);
        System.out.println("Total Investasi: Rp" + total);
        no += 1;
    }
}
