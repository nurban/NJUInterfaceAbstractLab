/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Neil Urban
 */

import javax.swing.JOptionPane;

public abstract class ProgrammingCourses {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public String getCourseName() {
        return courseName;
    }
    
    public double getCredits() {
        return credits;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }
    
     public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    //abstract because sub classes override it with their own credit value.
    public abstract void setCredits(double credits) ;
  
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
}
