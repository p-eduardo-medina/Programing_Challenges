import java.util.Random;

public class DiceRoller {
    Random random ; //Global Variables
    int number;
    DiceRoller(){
        random = new Random();        
        roll(random, number);
    }

    void roll(Random random_1, int number_1){
        number_1 = random_1.nextInt(6)+1;//Local Variables
        System.out.println(number_1);
    }
    void Rolling(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
