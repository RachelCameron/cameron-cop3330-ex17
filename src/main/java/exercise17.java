/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bac = 0;
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        int sex = input.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        int ounces = input.nextInt();
        System.out.println("What is your weight, in pounds?");
        int pounds = input.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        int hours = input.nextInt();
        if(sex == 1)
            bac = (ounces * 5.14 / pounds * .73) - .15 * hours;
        else if(sex == 2)
            bac = (ounces * 5.14 / pounds * .66) - .15 * hours;
        System.out.printf("Your BAC is %f\n ", bac);
        if(bac <= 0.08)
        {
            System.out.println("It is legal for you to drive.");
            return;
        }
        System.out.println("It is not legal for you to drive.");
    }
}