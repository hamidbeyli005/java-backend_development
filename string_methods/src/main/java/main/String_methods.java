package main;

import java.util.Scanner;

/**
 *
 * @author hamidhamidbayli
 */
public class String_methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        char ch = text.charAt(0);
        System.out.println("Method charAt: " + ch);

        String str = text.concat(" Concat new text");
        System.out.println("Method concat: " + str);

        boolean equal = text.equals("Hello Hamid");
        System.out.println("Method ewuals: " + equal);

        boolean equal_ignore_case = text.equalsIgnoreCase("heLLo HaMid");
        System.out.println("Method equalsIgnoreCase: " + equal_ignore_case);

        boolean empty = text.isEmpty();
        System.out.println("Method isEmpty: " + empty);

        String trim_text = text.trim();
        System.out.println("Method trim: " + trim_text);

        String text_lover = text.toLowerCase();
        System.out.println("Method toLowerCase: " + text_lover);

        String text_upper = text.toUpperCase();
        System.out.println("Method toUpperCase: " + text_upper);

        boolean start_hello = text.startsWith("Hello");
        System.out.println("Method startsWith: " + start_hello);

        boolean end_d = text.endsWith("d");
        System.out.println("Method endsWith: " + end_d);

        int length = text.length();
        System.out.println("Method length: " + length);

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + i + ": " + words[i]);
        }
    }
}
