public class Test26_Inheritance {

    public static void main(String[] args){
        
        Cars car = new Cars();
        car.go();

        Bicycle bike = new Bicycle();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
    
}
