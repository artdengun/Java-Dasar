package com.artdengun.java.dasar.TipeData;

public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;


        // ini berbahaya akan memunculkan error number overflow artinya
        // tipe data byte hanya bisa menambung 127 , sedangkan int lebih dari 1000
        // kalo mau casting manual, lihat dulu datanya sudah sesuai enggak dengan maks penampung
        // dari data yang kita punya
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
