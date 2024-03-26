/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

/**
 *
 * @author hamidhamidbayli
 */
public class Main {

    public static void main(String[] args) {
//        FileCreator.createFile("test.txt");
        MyFileWriter.writeFile("test.txt", "Hello Hamid ");
        MyFileWriter.appendFile("test.txt", "Append file");

        MyFileReader.readFile("test.txt");
    }
}
