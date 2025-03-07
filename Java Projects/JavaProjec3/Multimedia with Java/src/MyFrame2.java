import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame {

    JButton button;
    JLabel label;

    MyFrame2(){

        ImageIcon   imageIcon   = new ImageIcon("Foto.jpg"), 
                    imageIcon2  = new ImageIcon("Foto2.jpg"), 
                    image,
                    image2;
        Image       imageicon   = imageIcon.getImage(),
                    imageicon2  = imageIcon2.getImage();//Resize the image
        Image       newimage    = imageicon.getScaledInstance(80, 90,  java.awt.Image.SCALE_SMOOTH),
                    newimage2   = imageicon2.getScaledInstance(180, 190,  java.awt.Image.SCALE_SMOOTH);
                    image       = new ImageIcon(newimage);//Resize the image
                    image2      = new ImageIcon(newimage2);

        label = new JLabel();
        label.setIcon(image2);
        label.setBounds(150,350,200,200);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,200);
        button.addActionListener((e) -> 
                {
                    System.out.println("Hi");
                    //button.setEnabled(false);
                    label.setVisible(!label.isVisible());
                }
        );//Lambda function (parameter1, parameter2) -> { code block }
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(15);
        button.setForeground(new Color(0x123456));
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);  //Desahbilitar el boton

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

}
