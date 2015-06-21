
public class Alert {

     
    public static String[] sendAlert() {
        String[] messages = new String[3];
        messages[0] = Teacher.recieveAlert();
        messages[1] = Student.recieveAlert();
        messages[2] = AdditionalMaterials.sendAdditionalMaterials();
        return messages;
    }
    
    public static String[] sendAdvisorAlert() {
        String[] messages = new String[4];
        messages[0] = Teacher.recieveAlert();
        messages[1] = Student.recieveAlert();
        messages[2] = Advisor.recieveAlert();
        messages[3] =  AdditionalMaterials.sendAdditionalMaterials();
        return messages;    
        }
     
}

