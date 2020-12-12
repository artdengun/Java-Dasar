package com.artdengun.java.dasar.Perulangan;

public class PerulanganContinue {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 100; counter++){
            if(counter % 2 == 0 ){
                continue; // menghentikan saat ini dan melanjutkan perulangan berikutnya
            }

            System.out.println("Perulangan Ganjil-" + counter);
        }
    }
}
