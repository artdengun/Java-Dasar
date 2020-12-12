package com.artdengun.java.dasar.TipeData;

public class TipeDataArray {
    public static void main(String[] args) {
        // cara menginitialize array

        String[] stringArray;
        stringArray = new String[10]; // jumlah data array yang kita gunakan

        stringArray[0] = "Deni";
        stringArray[1] = "Gunawan";
        stringArray[2] = "Deni GUnawan";

        System.out.println(stringArray[0]); // data array yang kita panggil
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String [] StringArray2 = new String[20]; // ini juga bisa

        // array initalizer ( cara lain menginitialize nilai array)

        String[] namaNama =  {
                "DENI","GUNAWAN","DENI GUNAWAN"
        };
        int[] iniInt = new int[]{
                10,20,30,40,50,60
        };
        long[] iniLong = new long[]{
                10L,20L,30L
        };

        // OPERASI DI ARRAY

        // array[index] -> mengambil data array

        int[] iniDataIndex = new int[]{

                10,20,30,40,50,60,70
        };

        // array[index] = value -> mengubah data array

        iniDataIndex[0] = 100;
        iniDataIndex[1] = 40;

        //  array.lengt mengambil panjang data array

        System.out.println(iniDataIndex[0]);
        System.out.println(iniDataIndex[1]);
        System.out.println(iniDataIndex.length);

        // array dalam array

        String[][] arrayDalamArray={
                {"Deni","Gunawan"},
                {"Arum","Nurbaeti"},
                {"Ahmad","Zaelani"}
        };

        System.out.println(arrayDalamArray[0][1]);
        System.out.println(arrayDalamArray[1][0]);
        System.out.println(arrayDalamArray[2][1]);
    }
}
