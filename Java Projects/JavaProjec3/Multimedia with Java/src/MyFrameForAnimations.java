import java.awt.*;
import javax.swing.JFrame;

public class MyFrameForAnimations extends JFrame {

    MyPanelForAnimations panel;

    MyFrameForAnimations(){

        panel = new MyPanelForAnimations();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
}
