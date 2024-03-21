/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class NumberReverse {

    public static int reverseDigits(int number) {
        int reversed = 0;

        while (number > 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static void printPalindromeCheck(int number) {
        int num = reverseDigits(number);
        if (number == num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
