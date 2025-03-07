import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class ProgressBarDemo {
    
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();
    
    ProgressBarDemo(){

        progressBar.setValue(0);
        progressBar.setBounds(10,10,420,50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli",Font.BOLD,25));
        progressBar.setForeground(new Color(0x123456));
        progressBar.setBackground(Color.black);

        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(440,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }

    public void fill(){
        int counter = 0;
        while(counter<100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }//miliseconds
            counter += 4;
        }


        progressBar.setString("Done!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print(""+counter);
        if (counter==100) {
            System.out.print("CLOSE!!");
            frame.dispose();            
        }
    }
    
}
