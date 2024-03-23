/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author hamidhamidbayli
 */
public class Tayota extends Car implements IGaranty{

    @Override
    public void start() {
        System.out.println("Tayota start");
    }

    @Override
    public void stop() {
        System.out.println("Tayota stop");
    }

    @Override
    public void speedUp() {
        System.out.println("Tayota speed up");
    }

    @Override
    public void getWarrantyPeriod() {
        System.out.println("5 year official tayota warranty");
    }
}
