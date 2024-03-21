/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author hamidhamidbayli
 */
public class PrimeNumber {

    public static boolean checkIfPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    public static void printPrimeCheckResult(int number) {

        boolean isPrime = PrimeNumber.checkIfPrime(number);

        if (isPrime) {
            System.out.println(number + " sade ededdir.");
        } else {
            System.out.println(number + " sade eded deyil.");
        }
    }

    public static void findAndPrintPrimes(int number) {
        for (int i = 2; i <= number; i++) {
            boolean bool = PrimeNumber.checkIfPrime(i);
            if (bool) {
                System.out.println(i);
            }
        }
    }

}
