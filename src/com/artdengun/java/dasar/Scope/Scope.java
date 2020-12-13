package com.artdengun.java.dasar.Scope;

public class Scope {
    public static void main(String[] args) {
    sayHello("Deni");
    sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello" + name;
        if(!name.isBlank()){
            String hi = "HI" + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); akan erro karna diluar scope
    }
}
