package util;

import java.util.Scanner;
import util.MathUtil;

/**
 *
 * @author hamidhamidbayli
 */
public class Calculator {

    public static void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number:");
        double a = sc.nextDouble();

        System.out.println("Seconda number:");
        double b = sc.nextDouble();

        System.out.println("Select operation( + 1, - 2, * 3, / 4):");
        int operation = sc.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = MathUtil.add(a, b);
                break;
            case 2:
                result = MathUtil.subtract(a, b);
                break;
            case 3:
                result = MathUtil.multiply(a, b);
                break;
            case 4:
                result = MathUtil.divide(a, b);
                break;
            default:
                System.out.println("Operation is not valid");
                break;
        }
        System.out.println("result: " + result);
    }
}
