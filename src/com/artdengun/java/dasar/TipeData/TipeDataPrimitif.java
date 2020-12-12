package com.artdengun.java.dasar.TipeData;

public class TipeDataPrimitif {
    public static void main(String[] args) {
        Integer iniBukanPrimitif = null; // default valuenya adalah null
        int iniPrimitf = 0; // default valuenya adalah 0

        // kita casting dari primitif ke bukan primitif alias objek
        int iniprimitif2 = 100;
        Integer CastingPrimitif = iniprimitif2;
        System.out.println(CastingPrimitif);

        // kita casting dari bukan primitif ke primitf
        Integer CastingBukanPrimitif = 100;
        int iniPrimitif = CastingBukanPrimitif;
        System.out.println(iniPrimitif);

        // kita konversi dengan tipe data lain
        int age = 10;
        Integer umurObject = age;
        Short konversiKeDataLain = umurObject.shortValue();
        Long konversiLong = umurObject.longValue();
        Float konversiFloat = umurObject.floatValue();

        System.out.println(konversiFloat);
        System.out.println(konversiKeDataLain);
        System.out.println(konversiLong);


    }
}
