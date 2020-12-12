package com.artdengun.java.dasar.TipeData;

public class TipeDataVariable {
    public static void main(String[] args) {
        String name;
        name = "Deni Gunawan";

        System.out.println(name);

        int age = 23;
        String addres = "Bekasi";

        System.out.println(age);
        System.out.println(addres);

        name = "Dengun";
        age = 21;
        System.out.println(name);
        System.out.println(age);
//
//        final String application = "Deni Gunawan"; // akan tampil pesan error
//
//        application = "Ini akan Error, karna data application tidak bisa diubah, karna menggunakan final";

        var nama = 10;
        var Integer = 20;
        var NamaPertama = "Komplang";

        System.out.println(nama);
        System.out.println(Integer);
        System.out.println(NamaPertama);
    }
}
