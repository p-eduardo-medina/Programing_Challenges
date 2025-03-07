import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test41_Panels {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon("Foto.jpg"),image;
        Image imageicon = imageIcon.getImage();//Resize the image
        Image newimage = imageicon.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH);//Resize the image
        image = new ImageIcon(newimage);//Resize the image

        JLabel label =new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(20,30,140,140);

        JPanel redPanel = new JPanel(); //Add components to the panel
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel(); //Add components to the panel
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(260,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel(); //Add components to the panel
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,260,500,250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        bluePanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        
    }
}
