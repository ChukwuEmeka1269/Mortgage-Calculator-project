package com.emekafirstjavaprogram;

import java.text.NumberFormat;

public class PrintReport {

    private CalculateMortgage calculate;

    public PrintReport(CalculateMortgage calculate) {
        this.calculate = calculate;
    }

    public PrintReport() {
    }

    public void printMortgageReport(){
        String mortgageFormatted = calculate.calculateMortgage();
        System.out.println();
        System.out.println("MORTGAGE REPORT");
        System.out.println("----------------");
        System.out.println("Your monthly mortgage payment is: " + mortgageFormatted);

    }

    public void printPaymentSchedule(){
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month <= calculate.getPeriod() * calculate.MONTHS_IN_YEAR; month++){
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(calculate.calculateRemainingBalance(month));
            System.out.println(balanceFormatted);
        }

    }
}
