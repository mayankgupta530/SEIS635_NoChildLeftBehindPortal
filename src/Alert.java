
public class Alert {

    public static void sendAlert() {
        Teacher.recieveAlert();
        Student.recieveAlert();
        AdditionalMaterials.sendAdditionalMaterials();
    }
    
    public static void sendAdvisorAlert() {
        Teacher.recieveAlert();
        Student.recieveAlert();
        Advisor.recieveAlert();
        AdditionalMaterials.sendAdditionalMaterials();
    }
    
   
        
}

