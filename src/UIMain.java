import javax.swing.JFrame;


public class UIMain extends JFrame{

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        JFrame frame = new JFrame ("No Child Left Behind Portal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        UIPanel panel = new UIPanel();
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
    }

}
