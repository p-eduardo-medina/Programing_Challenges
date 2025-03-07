import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Test40_LAbels {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("Foto.jpg"),image;
        Image imageicon = imageIcon.getImage();//Resize the image
        Image newimage = imageicon.getScaledInstance(170, 200,  java.awt.Image.SCALE_SMOOTH);//Resize the image
        image = new ImageIcon(newimage);//Resize the image
        Border border = BorderFactory.createLineBorder(Color.RED,3);
        
        JLabel label = new JLabel();//CReate a label
        label.setText("Hey there!!");//Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//Set text LEFT, CENTER, right image
        label.setVerticalTextPosition(JLabel.TOP);//Set text TOP or BOTTOM
        label.setForeground(new Color(0x00FF00));   
        label.setFont(new Font("MV Boli", Font.PLAIN,20 ));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//sET VERTICAL POSITION OF ICON+TEXT WITHIN LABEL
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(20,20,250,250);// Limits of the label (x,y,width, )

        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jframe.setSize(400,400);
        //jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.add(label);
        jframe.pack(); //fit the size to the components
    }
}
