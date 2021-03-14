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

        //Step 2: Call Scanner class to read in inputs
        Scanner readVal = new Scanner(System.in);

        //Step 3: Input mortgage variables
        System.out.print("Principal: ");
        int principal = readVal.nextInt();

        System.out.print("Annual Interest: ");
        float annualInterest = readVal.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(Year): ");
        byte period = readVal.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        //Step 4: Calculate Mortgage monthly payment
        double mortgage = principal * ((monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))) / ((Math.pow(1 + monthlyInterest, numberOfPayments) - 1)));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your monthly mortgage payment is: " + mortgageFormatted);





    }
}
