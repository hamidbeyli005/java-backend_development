/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class NumberDigitSum {

    public static void printSumOfDigits(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}
