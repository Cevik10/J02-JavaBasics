package com.hakancevik;

public class Loops {
    public static void main(String[] args) {

        // FOR LOOP

        int[] myNumbers = {12,15,18,21,24};

        for (int i = 0; i < myNumbers.length; i++) {

            int x = myNumbers[i] / 3 * 5;
            //System.out.println(x);

        }


        // foreach

        for (int number : myNumbers) {

            //System.out.println(number / 3 * 5);

        }

        for (int a = 0; a < 10; a++) {
            int b = a * 10;
            //System.out.println(b);
        }



        //WHILE

        int j = 0;

        while (j < 10) {
            int m = j *10;
            System.out.println(m);

            j++;
        }



    }
}
