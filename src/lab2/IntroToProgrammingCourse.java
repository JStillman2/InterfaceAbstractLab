package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements CollegeCourse{
    
    
    private String firstName;
    private String lastName;
    private String studentID;
    
    
        @Override
    public String getCourseName() {
        return "Intro to Programming";
    }

    @Override
    public String getCourseNumber() {
        return "152-107";
    }
    
    @Override
    public double getCourseCredits() {
        return 2;
    }

    @Override
    public String getPrereq() {
        return "None";
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    
    
}
