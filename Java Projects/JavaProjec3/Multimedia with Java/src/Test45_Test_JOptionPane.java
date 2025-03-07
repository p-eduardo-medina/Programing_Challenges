import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test45_Test_JOptionPane {
    public static void main(String[] args) {
        /*
        JOptionPane.showMessageDialog(null, 
        "This is a PLAIN_MESSAGE",
        "Title", 
        JOptionPane.PLAIN_MESSAGE);
 
        JOptionPane.showMessageDialog(null, 
        "This is a INFORMATION_MESSAGE",
        "Title", 
        JOptionPane.INFORMATION_MESSAGE);
 
        JOptionPane.showMessageDialog(null, 
        "This is a QUESTION_MESSAGE",
        "Title", 
        JOptionPane.QUESTION_MESSAGE);
 
        JOptionPane.showMessageDialog(null, 
        "This is a WARNING_MESSAGE",
        "Title", 
        JOptionPane.WARNING_MESSAGE);
 
        JOptionPane.showMessageDialog(null, 
        "This is a ERROR_MESSAGE",
        "Title", 
        JOptionPane.ERROR_MESSAGE);
        


        int answ = 
        JOptionPane.showConfirmDialog(null,
        "Hello World",
        "Title", JOptionPane.YES_NO_CANCEL_OPTION)
        ;

        JOptionPane.showMessageDialog(null, 
        ""+answ,
        "Answer", 
        JOptionPane.PLAIN_MESSAGE);

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello"+name);
         */
        String[] responses = {"Yes, you're","Not, you're not","Probably"};
        ImageIcon icon = new ImageIcon("Foto2.jpg");

        JOptionPane.showOptionDialog(null,
            "Awsome",
            "secret message",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            0);
    }
}
