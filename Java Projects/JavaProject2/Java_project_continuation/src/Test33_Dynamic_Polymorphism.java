import java.util.Scanner;

public class Test33_Dynamic_Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("(1 = dog) or (2=cat) or (3 = bird)");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
            animal = new Dog();
            animal.speak();
                break;
            case 2:
            animal = new Cat();
            animal.speak();
                break;
            case 3:
            animal = new Bird();
            animal.speak();
                break;
            default:
                System.out.println("Invalid integer,try again");
                break;
        }
    }
}
