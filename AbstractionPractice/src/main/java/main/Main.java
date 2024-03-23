/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import bean.Bmw;
import bean.Car;
import bean.IAutoParking;
import bean.Mercedes;
import bean.Tayota;

/**
 *
 * @author hamidhamidbayli
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Bmw();
        car.start();
        System.out.println("-------------");

        Mercedes mercedes = new Mercedes();
        mercedes.start();
        mercedes.autoPark();
        System.out.println("-------------");

        Tayota prado = new Tayota();
        prado.start();
        prado.speedUp();
        prado.getWarrantyPeriod();
    }
}
