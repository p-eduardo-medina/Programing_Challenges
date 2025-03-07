import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
    
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);//MIN, MAX, Default value

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));//Tipo de letra
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText("ºC := "+slider.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,25));//Tipo de letra



        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        label.setText("ºC := "+slider.getValue());

    }
}
