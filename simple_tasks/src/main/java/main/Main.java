/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.util.Scanner;
import util.EvenNumber;
import util.NumberConverter;
import util.PrimeNumber;

/**
 *
 * @author hamidhamidbayli
 */
public class Main {

    public static void main(String[] args) {

        int num = getIntegerInputFromUser("Eded daxil edin: ");

//        NumberConverter.printNumberConversionResult();
//        EvenNumber.printEvenNumbers(num);
//        PrimeNumber.printPrimeCheckResult(num);

        PrimeNumber.findAndPrintPrimes(num);
    }

    public static int getIntegerInputFromUser(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        return sc.nextInt();
    }

}
