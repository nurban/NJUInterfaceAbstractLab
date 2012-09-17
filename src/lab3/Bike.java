/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Neil Urban
 */
public class Bike extends Vehicle implements SafetyGear {
    private int gearShift; //1, 2, 3, or 4
    
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
        System.out.println("Pushing pedals to speed up...");
    }
    
    
    //from abstract class "Vehicle" -- ensures that the vehicle can slow down.
    @Override
    public void slowDownVehicle() {
        System.out.println("Applying breaks to slow down...");
    }

    /**
     * @return the gearShift
     */
    public int getGearShift() {
        return gearShift;
    }

    /**
     * @param gearShift the gearShift to set
     */
    public void setGearShift(int gearShift) {
        //Validation is needed.
        this.gearShift = gearShift;
    }
        
}
