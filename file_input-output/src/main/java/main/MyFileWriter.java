/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hamidhamidbayli
 */
public class MyFileWriter {

    public static void writeFile(String fileName, String text, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void appendFile(String fileName, String text) {
        writeFile(fileName, text, true);
    }

    public static void writeFile(String fileName, String text) {
        writeFile(fileName, text, false);
    }

}
