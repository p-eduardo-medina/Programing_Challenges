import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrameForCheckBox extends JFrame implements ActionListener{

    JCheckBox checkBox;//There are also radioButtons
    JButton button;

    MyFrameForCheckBox(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("My Button");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Text Check Box");
        checkBox.setFont(new Font("Consolas", Font.PLAIN,10));

        this.add(checkBox);
        this.add(button);
        this.getContentPane().setBackground(Color.gray);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==button){
            checkBox.isSelected();
            System.out.println(checkBox.isSelected());
            
        }

    }
    
}
