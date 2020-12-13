package com.artdengun.java.dasar.Method;

public class MethodParameter {
    public static void main(String[] args) {
        helloWorld("Deni","Gunawan");
    }

    static void helloWorld(String firstName, String lastName){
        System.out.println("Nama saya " + firstName +" " +  lastName);
    }
}
