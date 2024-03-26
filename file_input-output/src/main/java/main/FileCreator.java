/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.File;

/**
 *
 * @author hamidhamidbayli
 */
public class FileCreator {

    public static void createFile(String fileName) {
        try {
            File myFile = new File(fileName);
            if (myFile.createNewFile()) {
                System.out.println("File successfully created: ");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
