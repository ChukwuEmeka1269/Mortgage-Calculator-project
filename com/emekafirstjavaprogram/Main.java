package com.emekafirstjavaprogram;


public class Main {

    public static void main(String[] args) {
        //This program calculates the monthly payment to be made on a principal amount
        //The Mortgage Calculator

        //Step 1: variable declaration and initialization



        var readValue = new ReadValueFromConsole();
        int principal = (int)readValue.readValueFromConsole("Principal", 1000, 1000000);
        double annualInterest = readValue.readValueFromConsole("Annual Interest Rate", 1, 100);
        short period = (short)readValue.readValueFromConsole("Period", 1, 100);

        var calculate = new CalculateMortgage(principal,annualInterest,period);
        double balance = calculate.calculateRemainingBalance((short) 10);
        System.out.println("balance remaining: " + balance);

        var report = new PrintReport(calculate);


        report.printMortgageReport();
        report.printPaymentSchedule();











    }
}
