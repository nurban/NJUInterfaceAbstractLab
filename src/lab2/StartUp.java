/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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
