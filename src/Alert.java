
public class Alert {

    public static void sendAlert() {
        System.out.println("Alert sent to student and teacher!");
        AdditionalMaterials.sendAdditionalMaterials();
    }
    
    public static void sendAdvisorAlert() {
        System.out.println("Alert sent to student, teacher, and advisor!");
        AdditionalMaterials.sendAdditionalMaterials();
    }
    
   
        
}

