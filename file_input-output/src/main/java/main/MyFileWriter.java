/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hamidhamidbayli
 */
public class MyFileWriter {

    public static void readFile(String fileName, String text) {
        try {
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write(text);
            myWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
