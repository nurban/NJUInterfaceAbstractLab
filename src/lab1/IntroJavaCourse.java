package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Neil Urban
 * @version     1.1
 */
import javax.swing.JOptionPane;

public class IntroJavaCourse extends ProgrammingCourses {
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
    if(credits < 0 || credits > 5.0) {
        JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
        System.exit(0);
        }
     this.setCredits(credits);
    }

}
