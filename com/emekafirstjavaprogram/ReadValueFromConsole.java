package com.emekafirstjavaprogram;

import java.util.Scanner;

public class ReadValueFromConsole {
    Scanner scanner = new Scanner(System.in);

    public ReadValueFromConsole() {
    }


    public double readValueFromConsole(String prompt, int min, int max){

        double valueToBeRead;
        while(true) {
            System.out.print(prompt + ":");
            valueToBeRead = scanner.nextDouble();
            if(valueToBeRead>min && valueToBeRead<max){
                break;
            }
            else{
                System.out.println("Please enter a value between" + min + " and " + max);
            }
        }

        return valueToBeRead;
    }

}
