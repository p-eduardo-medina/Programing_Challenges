import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanelForAnimations extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500, PANEL_HEIGHT=500; //Unvariable constant
    Image oldenemy,enemy, backGroundImage;
    Timer timer;
    int xVelocity=2, yVelocity=1,x = 10,y=25;

    MyPanelForAnimations(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        
        
        String pathEImage = "/home/eduardo/Documents/Challenges/Java Projects/JavaProjec3/Multimedia with Java/rocket.png";
        oldenemy = new ImageIcon(pathEImage).getImage();  //Resize IMage
        Image newimg = oldenemy.getScaledInstance(70, 80,  java.awt.Image.SCALE_SMOOTH);//Resize IMage
        enemy = new ImageIcon(newimg).getImage();//Resize IMage     
        String PathBGImage = "/home/eduardo/Documents/Challenges/Java Projects/JavaProjec3/Multimedia with Java/earth.jpg";
        backGroundImage = new ImageIcon(PathBGImage).getImage();



        timer = new Timer(10,this);// (delay, ActionListener)
        timer.start();

    }

    public void paint(Graphics g){

        super.paint(g); //Paint background from father class

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(backGroundImage, 0, 0,null);
        g2D.drawImage(enemy, x, y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH - enemy.getWidth(null) || x<0){
            xVelocity *= -1;
        }
        if(y>=PANEL_HEIGHT - enemy.getHeight(null) || y<0){
            yVelocity *= -1;
        }
        
        x += xVelocity;
        y += yVelocity;
        repaint();

    }
    
}
