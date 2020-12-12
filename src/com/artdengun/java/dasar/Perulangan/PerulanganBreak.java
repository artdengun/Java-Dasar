package com.artdengun.java.dasar.Perulangan;

public class PerulanganBreak {
    public static void main(String[] args) {
        var payment = 1;

        while (true){
            System.out.println("Perulangan Ke-" + payment);
            payment++;

            if (payment > 10){
                break; // Menghentikan program
            }
        }
    }
}
