import java.util.InputMismatchException;
import java.util.Scanner;

public class Test34_Exception_Handling {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a ehole number divde by: ");
            int x = scanner.nextInt();

            System.out.println("Enter a ehole number divde by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("Result: " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!! Pendejo!");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number! Pendejo!");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            scanner.close();
            System.out.println("This will always appears");
        }
    } 
}


