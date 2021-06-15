package com.emekafirstjavaprogram;



import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This program calculates the monthly payment to be made on a principal amount
        //The Mortgage Calculator

        //Step 1: variable declaration and initialization
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterest = 0;
        byte period = 0;
        int numberOfPaymentsMade = 0;

        //Step 2: Call Scanner class to read in inputs
        Scanner readVal = new Scanner(System.in);

        //Step 3: Input mortgage variables
        while(true) {
            System.out.print("Principal: ");
            principal = readVal.nextInt();
            if(principal>1000 && principal<1_000_000){
                break;
            }
            else{
                System.out.println("Please enter a value between 1000 and 1,000,000");
            }
        }

        while(true) {
            System.out.print("Annual Interest: ");
            annualInterest = readVal.nextFloat();
            if(annualInterest > 0 && annualInterest < 100) {

                break;
            }
            else{
                System.out.println("Interest rate is between 1% and 100%");
            }
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        while(true) {
            System.out.print("Period(Year): ");
            period = readVal.nextByte();
            if(period >= 1 && period <= 100) {
                break;
            }
            else{
                System.out.println("Enter a period between 1 - 100 years");
            }
        }
        int numberOfPayments = period * MONTHS_IN_YEAR;

        while(true) {
            System.out.println("Number of Payments Made: ");
            numberOfPaymentsMade = readVal.nextInt();
            if(numberOfPaymentsMade > 0){
                break;
            }
            else{
                System.out.println("Enter a value greater than 0");
            }
        }
        //Step 4: Calculate Mortgage monthly payment
        double mortgage = principal * ((monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))) / ((Math.pow(1 + monthlyInterest, numberOfPayments) - 1)));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        //Step 5: Calculate Remaining balance for payment schedule

        double remainingBalance = principal *
                (((Math.pow(1+monthlyInterest, numberOfPayments) - (Math.pow(1+monthlyInterest, numberOfPaymentsMade))))
                        /(Math.pow(1+monthlyInterest, numberOfPayments) - 1));

        String balanceFormatted = NumberFormat.getCurrencyInstance().format(remainingBalance);


        System.out.println();
        System.out.println("MORTGAGE REPORT");
        System.out.println("--------");
        System.out.println("Your monthly mortgage payment is: " + mortgageFormatted);



        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month<= numberOfPayments; month++){
            System.out.println(balanceFormatted);
        }





    }
}
