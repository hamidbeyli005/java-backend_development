/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class TextCleaner {

    public static String cleanText(String str) {

        String[] words = str.trim().split(" ");
        str = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "") {
                str += " " + words[i];
            }
        }
        return str;
    }

    public static void printCleanText(String str) {
        String text = cleanText(str);
        System.out.println(text);
    }

}
