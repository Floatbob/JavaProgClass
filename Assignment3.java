import java.util.ArrayList;

public class Assignment3 {

    
    public static void main(String[] args){
    
    int tutitionFinal = 0;

    ArrayList<CourseReg> courselist = new ArrayList<CourseReg>(); 
    courselist.add(new CourseReg("COP 3000", "Mary Cooper", 3 , 25 , 10));
    courselist.add(new CourseReg("COP 3010", "Sean Williams", 4 , 45 , 25));
    courselist.add(new CourseReg("COP 3020", "Matthew Johnson", 4 , 50 , 30));
    courselist.add(new CourseReg("COP 3030", "Jane Brown", 5 , 35 , 18));
    courselist.add(new CourseReg("COP 3040", "Emily Parker", 5 , 15 , 8));

    System.out.println("Course \t\tInstructor \t\tCredits \tCapacity \tEnrollment \tAvailable Seats \tEnrollment Tuition");   
    
    
    for (int index = 0; index < courselist.size(); index++){
        CourseReg course = courselist.get(index);
        String Output = String.format("%-20s"+"%-20s"+"%-20d"+"%-20d"+"%-20d"+"%-20d"+"$%-20d", course.getCourse(),course.getInstructor(),course.getCredits(),course.getCapacity(),course.getEnrollment(),course.getSeats(),course.getTuition());
        System.out.println(Output);
        tutitionFinal += course.getTuition();
    }

    
    System.out.println("The Total Enrollment Tuition for all courses is    $"+ tutitionFinal);




    }
}

