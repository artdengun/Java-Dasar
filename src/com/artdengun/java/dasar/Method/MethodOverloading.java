package com.artdengun.java.dasar.Method;

public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Deni");
        sayHello("Deni","Gunawan");
    }


    static void sayHello(){
        System.out.println("Hello Deni Tetap Semangat Belajarnya");
    }

    static void sayHello(String firstName){
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstname, String lastName){
        System.out.println("Hello " + firstname + " " + lastName);
    }
}
