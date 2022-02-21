package com.hakancevik;

public class Statements {
    public static void main(String[] args){

        // if statements

        int x = 99;
        float y = 9.9f;

        if (x < y) {
            System.out.println("y is bigger");
        }
        else if (y < x) {
            System.out.println("x is bigger");
        }
        else {
            System.out.println("x = y");
        }



        //switch

        String dayString = "";
        int day =1;

        switch (day){

            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);



    }
}
