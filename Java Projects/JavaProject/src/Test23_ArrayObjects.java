public class Test23_ArrayObjects {
    public static void main (String[] args){
    
        Food[] fridge = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Taco");
        Food food3 = new Food("Hotdog");

        Food[] fridge2 = {food3,food1,food2};

        fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
        
        System.out.println(fridge2[0].name);
        System.out.println(fridge2[1].name);
        System.out.println(fridge2[2].name);


    }
}
