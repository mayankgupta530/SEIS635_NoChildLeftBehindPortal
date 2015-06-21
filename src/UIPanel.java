import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UIPanel extends JPanel{

    private static final long serialVersionUID = 1L;
        
    private JLabel inputLabel, resultLabel;
        public JTextField grade;

        public UIPanel(){
            inputLabel = new JLabel("Enter Student Grade:");
            resultLabel = new JLabel("---");
            grade = new JTextField(3);
            grade.addActionListener(new GradeListener());
            
            add(inputLabel);
            add(grade);
            add(resultLabel);
            
            setPreferredSize(new Dimension(666,75));
            setBackground(Color.magenta);
        }
        
            public class GradeListener implements ActionListener {

                public void actionPerformed(ActionEvent e) {
                    int listenedgrade;
                    String formattedAlert = "";
                    String text = grade.getText();
                    
                    listenedgrade = Integer.parseInt(text);
                    String[] alertMessages = GradeChecker.CheckGrade(listenedgrade);
                    //We need to pass the listenedgrade to the GradeChecker class
                    for(int i=0; i<alertMessages.length-1; i++){
                        formattedAlert = formattedAlert + alertMessages[i]+ ", ";
                    }
                    if (alertMessages.length >= 1){
                        formattedAlert = formattedAlert + alertMessages[alertMessages.length-1];
                    }
               
                    resultLabel.setText(formattedAlert);
                    
                }
        }
}



