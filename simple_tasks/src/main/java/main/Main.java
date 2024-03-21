/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.util.Scanner;
import util.NumberConverter;

/**
 *
 * @author hamidhamidbayli
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eded daxil edin (0 ile 10000 arası): ");
        int number = scanner.nextInt();
        String result = NumberConverter.covertNumberToString(number);
        System.out.println(result);
    }
}
