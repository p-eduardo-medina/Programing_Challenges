import java.util.Scanner;

public class Test07_MathClass {
    public static void main (String[] args) {
        double a, b , y = 10.,z = Math.sqrt(y);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = scanner.nextDouble();


        System.out.println("Enter b: ");
        b = scanner.nextDouble();

        y = Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse is: " + y);
    }
}
