package com.artdengun.java.dasar.Percabangan;

public class PercabanganSwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";

        switch(nilai){
            case "A":
                System.out.println("Nilai Anda A");
                break;
            case "B":
                System.out.println("nilai anda B");
                break;
            case "C":
                System.out.println("Nilai anda C");
                break;
            case "D":
                System.out.println("Nilai Anda D");
                break;
            default:
                System.out.println("Nilai anda E");
        }

        // Java Lambda

        switch (nilai){
            case "A" -> System.out.println("Nilai anda Bagus Sekali");
            case "B", "C" -> System.out.println("Nilai anda Bagus");
            case "D" -> System.out.println("Nilai Anda D");
            default -> System.out.println("Nilai yang anda masukan tidak ada");
        }


        // switch yield lebih ringkas
        String ucapan = switch (nilai){
            case "A": yield "Nilai anda bagus sekali";
            case "B": yield "Nilai anda bagus";
            case "C": yield "Nilai anda cukup";
            case "D": yield "Nilai anda kurang";
            default:
                yield "Nilai tidak ada";
        };
        System.out.println(ucapan);
    }
}
