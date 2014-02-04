package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends WebAndSoftwareDegree{

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
    
}
