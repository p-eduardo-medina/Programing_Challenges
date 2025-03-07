import java.util.ArrayList;

public class Test14_ForEach_Loop {
    public static void main (String[] args){
        
        String[] animals = {"Cat","Dog","Rat","Bird"};
        ArrayList<String> animals_2 = new ArrayList<>();
        animals_2.add("Cat");
        animals_2.add("Dog");
        animals_2.add("Rat");
        animals_2.add("Bird");

        for(String animal: animals_2){
            System.out.println(animal);
        }
    }
}
