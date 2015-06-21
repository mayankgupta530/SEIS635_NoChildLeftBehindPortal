public class GradeChecker {

    public static String[] CheckGrade(int grade){
 
        String[] returnMessages;
        
       if(grade > 75){
           returnMessages = new String[1];
           returnMessages[0]="Thank you, Grade Submitted";
           return returnMessages;
       }
       if(grade > 60 && grade <=75){
           return Alert.sendAlert();
       }
       if(grade <= 60){
           return Alert.sendAdvisorAlert();
       }
    return null;
       
    }
}
