import javax.swing.JOptionPane;
// GRAFICAL USER INTERFACE

public class Test06_GUI {
    public static void main (String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");        
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));      
        JOptionPane.showMessageDialog(null, "Your age is:  " + age +" years old");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your age (in cm)"));      
        JOptionPane.showMessageDialog(null, "Your height is:  " + height +" cm");

        JOptionPane.showMessageDialog(null, "Thank you!");
    }
}    

