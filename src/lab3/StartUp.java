/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Neil Urban
 */

/*
 * This program contains 1 abstract class, and 3 interfaces. The abstract class,
 * Vehicle, contains two methods -- one for accelaration, and the other for slowing down --
 * which are both events that must occur for any vehicle. All subclasses extend this abstract
 * class. The two interfaces are Engine, SatefyGear, and AutoSafety. Engine in implemented only
 * by Car,because the other two subclasses are not automotive, and thus don't have an engine.
 * Bike and Skateboard implement SafetyGear, which contains methods for wearing a helmet
 * and knee guards. You do not need to wear these two things when driving a Car, so I
 * didn't implement this interface into Car. You must wear a seatbelt in a Car, but I
 * did not include this property in the interface because Car is the only subclass
 * (for now) that requires a seatbelt. If I were to implement it into SafetyGear, then
 * it would be required that you wear a seatbelt while riding a Bike/ Skateboard.
 * Thinking about the possibility of future additions, I realize that Car is the only
 * subclass FOR NOW that requires a seatbelt. I may have to add another vehicle in the future
 * that requires use of a seatbelt... So, I made a seperate interface, called "AutoSafety"
 * which contains a property that only Car uses for now -- strappedSeatBelt. Should an
 * addition be made which requires use of a seatbelt, I can simply implement this interface.
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        //instantiates an object for each type of Vehicle.
        Bike bike = new Bike();
        Skateboard board = new Skateboard();
        Car car = new Car();
        
    }
}
