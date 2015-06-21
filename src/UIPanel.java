import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class UIPanel extends JPanel{

        private JLabel inputLabel, resultLabel, outputLabel;
        public JTextField grade;

        public UIPanel(){
            inputLabel = new JLabel("Enter Student Grade:");
            outputLabel = new JLabel("Entered Grade");
            resultLabel = new JLabel("---");
            grade = new JTextField(3);
            grade.addActionListener(new GradeListener());
            
            add(inputLabel);
            add(grade);
            add(outputLabel);
            add(resultLabel);
            
            setPreferredSize(new Dimension(300,75));
            setBackground(Color.magenta);
        }
        
            private class GradeListener implements ActionListener {

                public void actionPerformed(ActionEvent e) {
                    int listenedgrade, result;
                    
                    String text = grade.getText();
                    
                    listenedgrade = Integer.parseInt(text);
                    //We need to pass the listenedgrade to the GradeChecker class
                    resultLabel.setText (Integer.toString(listenedgrade));
                    

                }

            

            
            
        }
}



