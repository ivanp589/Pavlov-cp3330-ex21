package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
    App ask = new App();
    int month = ask.number();
    String m = ask.string(month);
       out.println(String.format("The name of the month is %s",m));
    }
    private String string(int month){
        switch (month){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "april";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
    }
    return "Invalid number entered";
    }
    private int number(){
        out.print("Please enter the number of the month: ");
        return in.nextInt();
    }
}
