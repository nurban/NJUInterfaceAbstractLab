/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nurban
 */
public interface ProgrammingCourse {
    
    public abstract String getCourseName();
    public abstract String getCourseNumber();
    public abstract double getCredits();
    public abstract void setCourseName(String courseName);
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits);
    
}
