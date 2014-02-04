package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends WebAndSoftwareDegree{

    

    
        @Override
    public String getCourseName() {
        return "Intro to Java Programming";
    }

    @Override
    public String getCourseNumber() {
        return "152-134";
    }
    
    @Override
    public double getCourseCredits() {
        return 4;
    }

    @Override
    public String getPrereq() {
        return "Intro to Programming";
        
    }
}
