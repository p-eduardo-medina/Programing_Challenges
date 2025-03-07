import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame {
    Myframe(){
        this.setTitle("New JFrame tittle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit out of the appp
        this.setResizable(false); //Not resize
        this.setSize(420,420); //Dimensions
        this.setVisible(true); //make it visible


        ImageIcon image = new ImageIcon("Foto.jpg");//Create ImageIcon
        this.setIconImage(image.getImage());//Set image in Icon
        this.getContentPane().setBackground(new Color(0x123456));
        
    }  
}
