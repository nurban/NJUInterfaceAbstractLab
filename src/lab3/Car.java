/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Neil Urban
 */
public class Car extends Vehicle implements Engine, AutoSafety {
    
    //a boolean field -- strapedSeatBelt is included in an interface, "AutoSafety".
    public void startEngine() {
        //if the seat belt is off, put it on first; else if seat belt is on, start engine.
        if (!(isStrappedSeatBelt())) {
            System.out.println("Apply your seat belt before starting the engine!");
        } else {
            System.out.println("Turning key to start car engine...");
        }
    }
    
    //from abstract class "Vehicle" -- ensures that the vehicle can accelarate.
    @Override
    public void accelerateVehicle() {
        System.out.println("Pushing pedals to speed up...");
    }
    
    //from abstract class "Vehicle" -- ensures that the vehicle can slow down.
    @Override
    public void slowDownVehicle() {
        System.out.println("Applying breaks to slow down...");
    }

    /**
     * @return the strappedSeatBelt
     */
    public boolean isStrappedSeatBelt() {
        return strappedSeatBelt;
    }

    /**
     * @param strappedSeatBelt the strappedSeatBelt to set
     */
    public void setStrappedSeatBelt(boolean seatBelt) {
        //validation is needed.
        seatBelt = strappedSeatBelt;
        
    }

    
    
}
