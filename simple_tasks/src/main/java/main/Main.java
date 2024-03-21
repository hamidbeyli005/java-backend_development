/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.util.Scanner;
import util.EvenNumber;
import util.NumberConverter;
import util.NumberDigitSum;
import util.PrimeNumber;

/**
 *
 * @author hamidhamidbayli
 */
public class Main {

    public static void main(String[] args) {

        int number = getIntegerInputFromUser("Eded daxil edin: ");

//        NumberConverter.printNumberConversionResult();
//        EvenNumber.printEvenNumbers(number);
//        PrimeNumber.printPrimeCheckResult(number);
//        PrimeNumber.findAndPrintPrimes(number);


        NumberDigitSum.printSumOfDigits(number);

    }

    public static int getIntegerInputFromUser(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }

}
