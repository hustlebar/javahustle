package com.hustlebar.javahustle.easy;

import java.util.Scanner;

/**
 * Find the nearest 10 divisible number
 *
 * @author tham
 */
public class Nearest10 {
    public void findNearest10(int given) {
        if (given <= 0) {
            System.out.println("Please enter a valid number which is greater than 0");
            return;
        }

        int reminder = given % 10;
        if (reminder == 0) {
            System.out.println("The nearest 10 divisible number is: " + given);
        } else if (reminder < 5) {
            System.out.println("The nearest 10 divisible number is: " + (given - reminder));
        } else if (reminder > 5) {
            System.out.println("The nearest 10 divisible number is: " + (given + (10 - reminder)));
        } else {
            System.out.println("The nearest 10 divisible numbers are: " + (given - reminder) + " and " + (given + reminder));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scanner.nextInt();
        new Nearest10().findNearest10(input);
    }
}
