
import java.util.Scanner;


public class Test09_Statement {
    public static void main (String[] args) {
        // IF statement
        int age = 18;
        if ( age>18 ){
            System.out.println("you're an adult");
        }
        else if (age==18){
            System.out.println("you're now an adult");   
        }
        else{
            System.out.println("you're a child");
        }

        // SWITCH statement

        String day = "Fraday";

        switch (day) {
            case "Sunday":  System.out.println("It's Sunday");    
                break;
            case "Monday":  System.out.println("It's Monday");    
                break;
            case "Tusday":  System.out.println("It's Tusday");    
                break;
            case "Wednsday":  System.out.println("It's Wednsday");    
                break;
            case "Thusday":  System.out.println("It's Thusday");    
                break;
            case "Fraday":  System.out.println("It's Farday");    
                break;
            case "Saturday":  System.out.println("It's Saturday");    
                break;
            default: System.out.println("Invalid input");
                break;
        }

        // While loop
        Boolean flag = true;
        int coun = 0;

        while (flag) {
            if (coun<5) {
                System.out.println(coun);
                coun++;
            }
            else{
                System.out.println("Bye");
                flag = false;
            }

        }

        //For loop

        for(int i=0;i<10;i+=2){
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol;

        //Nested loop
        System.out.println("\n\n");

        System.out.println("Enter # of rows");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns");
        columns = scanner.nextInt();
        System.out.println("Enter Symbol");
        symbol = scanner.next();

        for(int i = 1; i<=rows;i++){
            System.out.println();
            for(int j = 0; j<=columns;j++){
                System.out.print(symbol);
            }
        }



    }

}
