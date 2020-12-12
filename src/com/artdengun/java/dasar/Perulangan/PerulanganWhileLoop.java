package com.artdengun.java.dasar.Perulangan;

public class PerulanganWhileLoop {
    public static void main(String[] args) {
        var counter = 100;

        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 120);
    }
}
