package com.joycoder;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {

        //Scanner class
        Scanner input = new Scanner(System.in);


        //declaring variable
        String name;
        int age;


        //get value from user
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your Age : ");
        age = input.nextInt();


        //printing details
        System.out.printf("\n\nWelcome %s\nYour age is: %d", name, age);

    }

}
