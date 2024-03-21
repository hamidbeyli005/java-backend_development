/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class SwapVariables {

    public static void swapAndPrintValues(int x, int y) {
        System.out.println("Before swapping:");
        System.out.println("a = " + x);
        System.out.println("b = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:");
        System.out.println("a = " + x);
        System.out.println("b = " + y);
    }

}
