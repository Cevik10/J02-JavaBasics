package com.hakancevik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){

        // ARRAYS

        String[] nameArray = new String[4];  // bu şekilde tanımlanıp daha sonra değer atabiliriz.
        // int[] numbArray = new int[3];

        nameArray[0]="Spock";
        nameArray[1]="Pike";
        nameArray[2]="Kirk";
        nameArray[3]="Scott";

        int[] Years = {10987,19223,20001}; // anında değer ataması yapılabilir.

        System.out.println("My favorite captain : " + nameArray[2]);
        System.out.println("Star year : "+ Years[0]);
        System.out.println("\n");




        // LISTS

        ArrayList<String> myList = new ArrayList<>();

        myList.add("life");
        myList.add("death");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println("Options --> " + myList.size());
        System.out.println("\n");



        // SETS

        HashSet<Integer> mySet = new HashSet<>(); // aynı değerden birden fazla eklenmez küme mantığı ile aynı.
                                                  // tanımlarken primitif değiken yazılmamalı.
        mySet.add(33);
        mySet.add(33); // sadece 1 tane 33 değeri eklenir.
        mySet.add(87);



        // HashMap

        HashMap<Integer,String> numberPlate = new HashMap<>(); // Python'daki dictionary mantığı ile aynıdır.

        numberPlate.put(34,"Istanbul");
        numberPlate.put(7,"Antalya");

        System.out.println(numberPlate.get(34));
        System.out.println(numberPlate.get(7));


    }


}
