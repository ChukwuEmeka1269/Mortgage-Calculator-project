package com.emekafirstjavaprogram;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This program accepts 2 integers from users
        //Computes the sum, product, difference and quotient

        int number1;//declare first number
        int number2; //declared second number
        int sum;
        int product;
        int difference;
        int quotient;

        Scanner input = new Scanner(System.in);//Calling the Scanner class
        System.out.print("First NUmber: ");//prompt user
        number1 = input.nextInt();//read in the first value

        System.out.print("Second Number: ");//prompt user
        number2 = input.nextInt(); //read in the second value

        //Start computation of sum
        System.out.printf("Sum is: %d", sum = number1 + number2);

        //compute product
        System.out.printf("\nProduct is: %d ", product = number1 * number2);

        //compute difference
        System.out.printf("\nDifference is: %d ", difference = (number2 - number1));

        //compute quotient
        System.out.printf("\nQuotient is: %d", quotient = number1 % number2);









    }

}




