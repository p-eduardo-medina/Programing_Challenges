import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPane implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton myButton = new JButton("new Button");


    LaunchPane(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource()==myButton){
            frame.dispose();//Hide the main Panel
            new NewWindow();
            
        }

    }
}
