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
public class EvenNumber {

    public static void printEvenNumbers(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
