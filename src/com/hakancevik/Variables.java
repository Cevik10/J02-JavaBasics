package com.hakancevik;

public class Variables {
    public static void main(String[] args){

        // INTEGER:
        int number=2720;  //int : tam sayı saklar.
        int number2;
        number2=1201602073;

        System.out.println("Number = " + number);
        System.out.println("Number2 = " +number2);

        // oto dönüşüm: byte(1 byte) --> short(4 byte) --> int(8 byte) --> long(16 byte) (tam sayi saklar.)



        //FLOAT AND DOUBLE
        float height = 160.8f;   // float(4 byte) ondalıklı sayı tutar,sonuna f konmalıdır.
        double coordinate=289.5; // double(8 byte) ondalıklı sayı tutar.

        System.out.println("Height = " + height);
        System.out.println("Coordinate = " + coordinate);

        // oto dönüşüm : int --> float --> double


        //CHAR AND BOOLEAN
        char charA = 'H';
        char numeric = '\u00F0'; // char(2 byte) : karakter veya unicode değeri tutabilir.

        System.out.println("CharA : "+ charA);
        System.out.println("Numeric : "+ numeric);

        boolean situation = true; // boolean : true veya false olabilir.

        System.out.println("Is Correct : "+ situation);


        //STRINGS

        String myString = "Space the last frontier"; // stringlerin metotları vardır.
        String name;
        name = "Captain Kirk";

        System.out.println("Star Trek : "+myString);
        System.out.println("Name : "+name);



    }
}
