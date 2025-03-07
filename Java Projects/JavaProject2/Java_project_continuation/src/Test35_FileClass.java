import java.io.File;

public class Test35_FileClass {
    public static void main(String[] args) {
        File file = new File("/home/eduardo/Documents/Challenges/Java Projects/JavaProject2/Java_project_continuation/src/Secret_message.txt");

        if(file.exists()){
            System.out.println("File existe");
            /*
             * System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.isFile());
                file.delete();
             */            
        }else{
            System.out.println("File doesn't existe");
            
        }
    }
}
