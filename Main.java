package com.emekafirstjavaprogram;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Call the readNumber Class to read in values
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30);
        byte period = (byte) readNumber("Period(year): ", 1, 30);

        //Calculate the Mortgage by calling the calculateMortgage method
        double mortgage = calculateMortgage(principal, annualInterest, period);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your monthly mortgage is: " + mortgageFormatted);


    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while(true){
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and" + " " + max);
        }

        return value;
    }


    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte period) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numOfPay = (short)(period * MONTHS_IN_YEAR);

        return principal *
                ((monthlyInterest * (Math.pow(1 + monthlyInterest, numOfPay))
                        /(Math.pow(1 + monthlyInterest, numOfPay) - 1)));

    }

}

/* Summary of this program:
The program calculates the monthly mortgage payment for a principal loan collected at an annual interest for some period of years.
Two methods created:
1. readNumber method created to accepted valid inputs
2. calculateMortgage method to calculate the monthly mortgage payment.

The two methods are called in to the main class to execute the valid inputs provided
 */




