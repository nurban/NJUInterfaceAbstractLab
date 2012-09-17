/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Neil Urban
 */
public class Skateboard extends Vehicle implements SafetyGear {
    
    //from interface "SafetyGear" -- ensures that the helmet is applied.
    public void applyHelmet() {
        System.out.println("Putting on helmet...");
    }

    //from interface "SafetyGear" -- ensures that knee guards are strapped on.
    public void applyKneeGuards() {
        System.out.println("Strapping on knee guards...");
    }
    //from abstract class "Vehicle" -- ensures that the vehicle can accelarate.
    @Override
    public void accelerateVehicle() {
        System.out.println("Pushing off with leg to speed up...");
    }
    
    //from abstract class "Vehicle" -- ensures that the vehicle can slow down.
    @Override
    public void slowDownVehicle() {
        System.out.println("Leaning back end of board to ground to slow down...");
    }
}
