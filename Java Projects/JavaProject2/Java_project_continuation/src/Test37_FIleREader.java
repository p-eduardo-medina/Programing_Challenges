import java.io.FileReader;
import java.io.IOException;

public class Test37_FIleREader {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("Secret_message.txt");
            int data = reader.read();//reader returns an integer that contains the info of the character
            while (data !=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        }catch(IOException e){
            e.printStackTrace();            
        }
    }
}
