/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author hamidhamidbayli
 */
public class NumberConverter {

    public static String covertNumberToString(int number) {
        if (number < 0 || number > 10000) {
            return "0-10000 arasi eded daxil ede bilersiniz!";
        }

        String[] ones = {"", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekkiz", "Doqquz"};
        String[] tens = {"", "On", "Iyirmi", "Otuz", "Qirx", "Elli", "Altmış", "Yetmiş", "Seksen", "Doxsan"};
        String[] hundreds = {"", "Yüz", "İki Yüz", "Üç Yüz", "Dört Yüz", "Beş Yüz", "Altı Yüz", "Yeddi Yüz", "Sekkiz Yüz", "Doqquz Yüz"};
        String[] thousands = {"", "Min", "İki Min", "Üç Min", "Dört Min", "Beş Min", "Altı Min", "Yeddi Min", "Sekkiz Min", "Doqquz Min"};

        if (number < 10) {
            return ones[number];
        } else if (number < 100) {
            int firstStep = number % 10;
            int secondStep = number / 10;
            return tens[secondStep] + " " + ones[firstStep];
        } else if (number < 1000) {
            int firstStep = number % 10;
            int secondStep = (number / 10) % 10;
            int thirdStep = number / 100;
            return hundreds[thirdStep] + " " + tens[secondStep] + " " + ones[firstStep];
        } else if (number < 10000) {
            int firstStep = number % 10;
            int secondStep = (number / 10) % 10;
            int thirdStep = (number / 100) % 10;
            int fourthStep = number / 1000;
            return thousands[fourthStep] + " " + hundreds[thirdStep] + " " + tens[secondStep] + " " + ones[firstStep];
        }
        return "";
    }
}
