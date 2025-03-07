import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrameForTextField extends JFrame implements ActionListener{

    JButton button;  //The key Word JButton only goes HERE!!!!!!
    JTextField textField;//The key WOrd JTextField only goes HERE!!!!!!


    MyFrameForTextField(){

        button = new JButton("My Button");//Never add JButton in this part
        button.addActionListener(this);//this pass the action the actionPerformed

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

                
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,30));//Size of words
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(new Color(0x123456));
        textField.setText("Useless Text");

        this.add(textField);
        this.getContentPane().setBackground(Color.gray);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            String text =textField.getText();
            System.out.println("Your text is: "+text);
            textField.setEditable(false);
        }

    }
    
}
