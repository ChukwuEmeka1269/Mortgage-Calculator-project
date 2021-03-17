package com.emekafirstjavaprogram;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Mortgage Calculator program: Modified.
        //Step 1: Initialize Constant Variables
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        //Step 2: Prompt to input value

        Scanner readVal = new Scanner(System.in);
        int principal ;
        while(true){
            System.out.print("Principal: ");
            principal = readVal.nextInt();

            if (principal < 1000)
                System.out.println("Enter a number between 1000 and 1,000,000");
            if (principal >= 1000 && principal <= 1000000)
                break;
        }

        //prompt and read in the annual interest rate value


        double annualInterest;
        while(true){
            System.out.print("Annual Interest: ");
            annualInterest = readVal.nextDouble();
            if(annualInterest <= 0)
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            if(annualInterest > 0 && annualInterest <= 30)
                break;

        }

        //Calculate monthly interest
        double monInt = annualInterest / MONTHS_IN_YEAR / PERCENT;

        //prompt and read in the period
        byte period;
        int numPay;
        while(true) {
            System.out.print("Period(Years): ");
            period = readVal.nextByte();
            if(period == 0)
                System.out.println("Enter a value between 1 and 30");
            if(period > 0 && period <= 30)
                break;

        }
            numPay = period * MONTHS_IN_YEAR;



        //calculate Mortgage monthly payments
        double mortgage = principal * ((monInt * Math.pow(1 + monInt, numPay) / (Math.pow(1 + monInt, numPay) - 1)));
        String mortFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortFormatted);


    }
}




