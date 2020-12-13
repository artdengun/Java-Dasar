package com.artdengun.java.dasar.Method;

public class MethodVariableArguments {
    public static void main(String[] args) {

        sayCongrats("Deni Gunawan", 80,20,40,60,70,90,59);
    }

    static void sayCongrats(String name, int... values){
        var total = 80;

        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + "anda lulus");
        }else{
            System.out.println(name + " Anda tidak lulus " );
        }
    }
}
