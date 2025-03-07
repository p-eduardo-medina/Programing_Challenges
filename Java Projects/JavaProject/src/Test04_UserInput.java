import java.util.Scanner;

public class Test04_UserInput {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Whats yor name? :");
        String name = scanner.nextLine();


        System.out.println("How old are you:");
        int age = scanner.nextInt();


        scanner.nextLine(); //Poner exto si abrá diferentes escaneos de STRING
        System.out.println("What is your favorite food:");
        String food = scanner.nextLine();


        System.out.println("What is your favorite number:");
        int num = scanner.nextInt();
        
        System.out.println("Hello " +name);
        System.out.println("You're: "+age+" years old");
        System.out.println("You like: "  + food);
        System.out.println("Your number: "  + num);

    }
}
