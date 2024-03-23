/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author hamidhamidbayli
 */
public class Mercedes extends Car implements IAutoParking{
    
    @Override
    public void start() {
        System.out.println("Mercedes start");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes stop");
                
    }

    @Override
    public void speedUp() {
        System.out.println("Mercedes speed up");
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes Auto Parking");
    }
}
