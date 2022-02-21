package com.hakancevik;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){

        // INPUT ALMA

        Scanner input = new Scanner(System.in);


        System.out.print("Please,Input a text:");
        String text = input.nextLine(); // alacağımız değer string olduğu için nextline() dedik.
                                        // Farklı değişken olursa ona göre seçeceğiz.
        System.out.println("Text : "+text);



        System.out.print("\nHow old are you?");
        int age = input.nextInt();
        System.out.println("Your age : "+age);









    }
}
