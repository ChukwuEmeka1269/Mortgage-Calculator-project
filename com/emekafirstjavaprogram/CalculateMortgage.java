package com.emekafirstjavaprogram;

import java.text.NumberFormat;

public class CalculateMortgage {

    final byte MONTHS_IN_YEAR = 12;
    private final int principal;
    private final double annualInterest;
    private final short period;


    public CalculateMortgage(int principal, double annualInterest, short period) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.period = period;
    }

    public String calculateMortgage(){

        double monthlyInterest = getMonthlyInterest(annualInterest);
        float numberOfPayments = getNumberOfPayments();
        System.out.println("monthlyInterest1: " + monthlyInterest);
         double mortgage = principal * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/ ((Math.pow(1 + monthlyInterest, numberOfPayments) - 1))));
        return NumberFormat.getCurrencyInstance().format(mortgage);
    }


    public double calculateRemainingBalance(short numberOfPaymentMade){
        double monthlyInterest =  getMonthlyInterest(annualInterest);
        float numberOfPayments = getNumberOfPayments();
        return principal *
                (((Math.pow(1 + monthlyInterest, numberOfPayments) - (Math.pow(1 + monthlyInterest, numberOfPaymentMade))))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
    }


    public double getMonthlyInterest(double annualInterest){
        final byte PERCENT = 100;
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    public short getPeriod() {
        return period;
    }
    private int getNumberOfPayments() {
        return period * MONTHS_IN_YEAR;
    }
//    public short getNumberOfPayments(){
//        return (short)(period * MONTHS_IN_YEAR);
//    }
}
