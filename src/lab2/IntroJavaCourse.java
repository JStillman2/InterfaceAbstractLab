package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements CollegeCourse{

    
    private String firstName;
    private String lastName;
    private String studentID;
    private String courseName;
    private String courseNumber;
    private int courseCredits;
    private String prereq;
    
    
    
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
    
    
    public void String setCourseName(String courseName){
        this.courseName = courseName;
        
             
    }
        public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }
    
    public double setCourseCredits(int courseCredits){
        this.courseCredits = courseCredits;
        return 0;
    }
    
    public String setPrereq(String prereq){
        this.prereq = prereq;
        
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
