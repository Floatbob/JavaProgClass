public class CourseReg {
    private String course;
    private String instructor; 
    private int credits;
    private int capacity;
    private int enrollment;
    

    public CourseReg(String courser, String instruct, int cred, int cap, int enroll){
        course = courser;
        instructor = instruct;
        credits = cred;
        capacity = cap;
        enrollment = enroll;
    }



    public String getCourse()
    {
        return course;
    }

    public String  getInstructor()
    {
        return instructor;
    }
    
    public int getCredits()
    {
        return credits;
    }

    public int getCapacity()
    {
        return capacity;
    }


    public int getEnrollment()
    {
        return enrollment;
    }
    


    public int getSeats()
    {
        return capacity - enrollment;
    }

    public int getTuition()
    {
        return credits * 2500 * enrollment;

    }




}
