package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends WebAndSoftwareDegree{

   

    
        @Override
    public String getCourseName() {
        return "Advanced Java";
    }

    @Override
    public String getCourseNumber() {
        return "152-135";
    }
    
    @Override
    public double getCourseCredits() {
        return 4;
    }
    @Override
    public String getPrereq() {
        return "Intro to Programming and Intro to Java";
        
    }
}
