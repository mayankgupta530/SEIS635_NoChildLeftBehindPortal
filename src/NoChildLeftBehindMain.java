import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class NoChildLeftBehindMain extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    
    public static void main(String[] args) {
        new NoChildLeftBehindMain().setVisible(true);

    }
    private NoChildLeftBehindMain()     {
        super("No Child Left Behind");
        setSize(600,600); //1024x768, 800x600
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JButton button = new JButton("Click Me");
        button.setActionCommand("click");
        JButton button2 = new JButton("Button 2");
        button2.setActionCommand("button");
        button.addActionListener(this);
        button2.addActionListener(this);
        
        add(button);
        add(button2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = e.getActionCommand();
        
        if(name.equals("click")) {
            System.out.println("Click Me!");
        } else if(name.equals("button")) {
            System.out.println("Button 2 has been clicked");
        }
    }
}

