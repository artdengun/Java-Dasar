package com.artdengun.java.dasar;

import java.util.Date;

public class Block {
    public static void main(String[] args){

        int value; // ini namanya expression , 1 baris lengkap dinamakan statement karna ada ;
        value = 10; // ini namanya expression juga,  1 baris lengkap dinamakan statement karna ada ;

        System.out.println(value = 100); // System.out sampai ; disebut statment didalam kurung disebut 							expression karna ada nilanya

        // Assignment expression
        var nama = 10;
        // increment statement
        nama++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Date date = new Date();

    } // ini namanya block -> bergunaan untuk grooping aja sih
}
