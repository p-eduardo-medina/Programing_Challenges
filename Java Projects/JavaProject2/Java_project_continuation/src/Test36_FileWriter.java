import java.io.FileWriter;
import java.io.IOException;

public class Test36_FileWriter {
    public static void main(String[] args) {
        try{
            FileWriter write = new FileWriter("Poem.txt");
            write.write("Roses are red\n Violets are blue \n jajaja \n Rock and roll");
            write.append("\n\n\n\t\t\t A poem by Lalo");
            write.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
