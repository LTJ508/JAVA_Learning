package com.joycoder;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num1, num2;
        double result;

        System.out.print("Enter First Number: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("\n\nSum = "+result);

        result = num1 - num2;
        System.out.println("Sub = "+result);

        result = num1 * num2;
        System.out.println("Multiplication = "+result);

        result = (double) num1 / num2;
        System.out.println("Devided = "+result);

        result = num1 % num2;
        System.out.println("Remainder = "+result);



    }





}
