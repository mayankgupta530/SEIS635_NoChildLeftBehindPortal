import java.util.Scanner;
public class GradeChecker {

    public static void main(String[] args)
    {   
       Scanner scan = new Scanner(System.in);
       int AssignmentID = 1;
       int AssignmentGrade = 0;       
       Assignment a1 = new Assignment(AssignmentID, AssignmentGrade);
       
       System.out.println("Enter Grade for Assignment number 123:");
       a1.AssignmentGrade = scan.nextInt();
       
       if(a1.AssignmentGrade > 75){
           System.out.println("Thank you, Grade Submitted");
       }
       if(a1.AssignmentGrade <= 75){
           System.out.println("Thank you for submitting grade, Alert sent to Teacher and Student");
       }
       if(a1.AssignmentGrade <= 60){
           System.out.println("Thank you for submitting grade, Alert sent to Teacher, Student, and Advisor");
       }
       
    }
}