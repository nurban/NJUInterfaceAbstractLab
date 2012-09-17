/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Neil Urban
 */
public abstract class Vehicle {
    
    //abstract because every subclass is a type of vehicle and should implement
    //these methods.
    
    //ensures that the vehicle accelerates.
    public abstract void accelerateVehicle();
    
    //ensures that the vehicle slows down.
    public abstract void slowDownVehicle();
    
}
