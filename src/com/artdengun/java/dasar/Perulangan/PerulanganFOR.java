package com.artdengun.java.dasar.Perulangan;

public class PerulanganFOR {
    public static void main(String[] args) {
        // for yang tidak akan berhenti
//        for(;;){
//            System.out.println("POST YANG TIDAK AKAN BERHENTI");
//        }

        // for dengan menggunakan kondisi
        var counter = 1;

        for(; counter <= 10;){
            System.out.println("Perulangann Ke-" + counter);
            counter++;
        }

        // for dengan menggunakan init statement

        for (int cashier = 1;  cashier <= 10;){
            System.out.println("Perulangan Ke-" + cashier);
            cashier++;
        }

        // for dengan menggunakan post statement

        for(int nilai  = 1; nilai <= 100; nilai++){
            System.out.println("Nilai Anda Jelek");
        }

    }
}
