/*
 *ABSTRACT CLASSES CANNOT BE INSTANTIATED,
    BUT THEY CAN HAVE A SUBCLASS ABSTRACT 
    METHODS ARE DECLARED WITHOUT AN IMPLEMENTATION.
 */
public class Test30_Abstraction {
    public static void main(String[] args) throws Exception {
        //Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();

    }
}
  