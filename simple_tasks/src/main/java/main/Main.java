/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.util.Scanner;
import util.EvenNumber;
import util.NumberConverter;
import util.NumberDigitSum;
import util.PrimeNumber;
import util.UserInputHandler;

/**
 *
 * @author hamidhamidbayli
 */
public class Main {

    public static void main(String[] args) {

        int number = UserInputHandler.getIntegerInputFromUser("Eded daxil edin: ");

//        NumberConverter.printNumberConversionResult();
//        EvenNumber.printEvenNumbers(number);
//        PrimeNumber.printPrimeCheckResult(number);
//        PrimeNumber.findAndPrintPrimes(number);


        NumberDigitSum.printSumOfDigits(number);

    }


}
