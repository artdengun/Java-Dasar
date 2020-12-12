package com.artdengun.java.dasar.Matematika;

public class OperasiMatematika {
    public static void main(String[] args) {
        // OPERASI ARITMATIKA

        int a = 100;
        int b = 200;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // OPERASI ASSINGMENT
        System.out.println("=========================================");
        int c = 100;

        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);
        c /= 10;
        System.out.println(c);
        c %= 10;
        System.out.println(c);


        System.out.println("==============================");
        // UNARY OPERATOR
        int ab = +100;
        ab++;
        System.out.println(ab); // harusnya 101
        ab--;
        System.out.println(ab); // 100
        System.out.println(!false); // kebalikanya
        System.out.println("==============");

        // operator perbandingan

        int ac = 100;
        int ad = 200;

        System.out.println(ac > ad);
        System.out.println(ac < ad);
        System.out.println(ac >= ad);
        System.out.println(ac <= ad);
        System.out.println(ac == ad);
        System.out.println(ac != ad);
    }
}
