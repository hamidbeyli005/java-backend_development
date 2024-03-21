/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class FactorialCalculator {

    public static int calculateFactorialUsingLoop(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers.");
        }
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int calculateFactorialUsingRecursion(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers.");
        }

        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorialUsingRecursion(--number);
    }

    public static void printFactorialUsingLoop(int number) {
        int result = calculateFactorialUsingLoop(number);
        System.out.println("Factorial using loop: " + result);
    }

    public static void printFactorialUsingRecursion(int number) {
        int result = calculateFactorialUsingRecursion(number);
        System.out.println("Factorial using recursion: " + result);
    }

}
