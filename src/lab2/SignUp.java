/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author jstillman2
 */
public class SignUp {
    
    public static void main(String[] args) {
       AdvancedJavaCourse stu1 = new AdvancedJavaCourse();
        stu1.setFirstName("Nicole");
        stu1.setLastName("Stage");
        stu1.setStudentID("0004561021");
        
        
        System.out.println("Student: " + stu1.getFirstName() + " " + stu1.getLastName());
        System.out.println("Student ID: " + stu1.getStudentID());
        System.out.println("Course enrolled: " + stu1.getCourseName());
        System.out.println("Course Number: " + stu1.getCourseNumber());
        System.out.println("Prerequisites: " + stu1.getPrereq());
        
        
        IntroToProgrammingCourse stu2 = new IntroToProgrammingCourse();
        
        stu2.setFirstName("John");
        stu2.setLastName("Doe");
        stu2.setStudentID("0004561029");
        
        System.out.println("_______________________________________");
        
        System.out.println("Student: " + stu2.getFirstName() + " " + stu2.getLastName());
        System.out.println("Student ID: " + stu2.getStudentID());
        System.out.println("Course enrolled: " + stu2.getCourseName());
        System.out.println("Course Number: " + stu2.getCourseNumber());
        System.out.println("Prerequisites: " + stu2.getPrereq());
        
        IntroJavaCourse stu3 = new IntroJavaCourse();
        
        
        stu3.setFirstName("Randy");
        stu3.setLastName("Rawlings");
        stu3.setStudentID("0004561037");
        
        System.out.println("_______________________________________");
        
        System.out.println("Student: " + stu3.getFirstName() + " " + stu3.getLastName());
        System.out.println("Student ID: " + stu3.getStudentID());
        System.out.println("Course enrolled: " + stu3.getCourseName());
        System.out.println("Course Number: " + stu3.getCourseNumber());
        System.out.println("Prerequisites: " + stu3.getPrereq());
        
}
    
}
