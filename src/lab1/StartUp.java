/*
 * This design is good because, given that the user is using abstract types, it
 * is easy to take common methods and properties, and put them in their own method.
 * Also, each subclass which shares these common elements will automatically
 * inherit the common methods and properties from the abstract superclass. One
 * downside to this method is that the abstract class itself cannot be instantiated,
 * meaning that I had to instiante 3 indivudual objects for each course (as seen below),
 * instead of instantiating 3 course objects (one of each class), of type ProgrammingCourse. 
 */
package lab1;

/**
 *
 * @author Neil Urban
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        //creates objects of each course and instantiating them. 
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "1234");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "5678");
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "4321");
        
        
        
        
    }
}
