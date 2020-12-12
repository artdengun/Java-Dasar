package com.artdengun.java.dasar.Perulangan;

public class PerulanganForEach {
    public static void main(String[] args) {
        String[] arrays = {
                "Deni","Gunawan","Goden",
                "Belajar","Java","Mudah"
        };

        // ini cara ribet yang sering kita gunakan
        for(var i = 0; i < arrays.length;i++){
            System.out.println(arrays[i]);
        }


        // ini cara bestpratice untuk menggambil seluruh data 		di array
        for(var value : arrays){
            System.out.println(value);
        }
    }
}
