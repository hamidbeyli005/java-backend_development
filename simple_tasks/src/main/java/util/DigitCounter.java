/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class DigitCounter {

    public static int countDigits(int number) {
        String numberAsString = Integer.toString(number);

        int digitCount = numberAsString.length();

        return digitCount;
    }

    public static void printDigitCount(int number) {
        int digitCount = countDigits(number);
        System.out.println(digitCount);
    }
}
