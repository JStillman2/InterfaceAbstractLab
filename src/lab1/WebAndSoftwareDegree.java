/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Jay
 */
public abstract class WebAndSoftwareDegree {
    
    private String firstName;
    private String lastName;
    private String studentID;
    
    
    private final String  school = "WCTC";
    
        public abstract String getCourseName();
        public abstract String getCourseNumber();
        public abstract double getCourseCredits();
        public abstract String getPrereq();

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

        
        
    

