/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ratio;
        System.out.println("Enter a 1 is you are male or a 2 if you are female (numeric values only):");
        int sex = input.nextInt();
        System.out.println("How many ounces of alcohol did you have (numeric values only)?");
        int ounces = input.nextInt();
        System.out.println("What is your weight, in pounds (numeric values only)?");
        int pounds = input.nextInt();
        System.out.println("How many hours has it been since your last drink? (numeric values only)");
        int hours = input.nextInt();
        if(sex == 1) {
            ratio = 0.73;
        }
        else {
            ratio = 0.66;
        }
        double bac = (double)((ounces * (5.14 / pounds)*ratio) - .015 * hours);
        System.out.printf("Your BAC is %f\n", bac);
        if(bac <= 0.08)
        {
            System.out.println("It is legal for you to drive.");
            return;
        }
        System.out.println("It is not legal for you to drive.");
    }
}