
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*; 
public class Test38_Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       
        Scanner scanner = new Scanner(System.in);
        

        File file = new File("Eine Kleine Nachtmusik (by Mozart).wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);



        String response = "";

        while(!response.equals("Q")){
            System.out.println("\nP = play, Q = quit \nS = Stop R = Reset");
            System.out.print("\n\tEnter your choise: ");

            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case "P":
                    clip.start();
                    break;   
                case "S":
                    clip.stop();
                    break;      
                case "R":
                    clip.setMicrosecondPosition(0);   //En mili-seconds
                case "Q":
                    System.out.println("Bye");
                default:
                    System.out.println("Not a valid response yet");
                    break;
            }
        }        
        clip.close();
        scanner.close();

    }
}
