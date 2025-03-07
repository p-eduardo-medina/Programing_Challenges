import java.util.Random;

public class Test08_RandomNUmbers {
    public static void main (String[] args) {
        
        Random random = new Random();//Geneador de variables aleatorias
        int x = random.nextInt(10);
        double y = random.nextDouble();
        boolean bool = random.nextBoolean();
        System.out.println(bool);


    }   
}
