/*
 * Polymorphis is to creaqte an array
 * of different classes with the same 
 * super class
 */
public class Test32_Polymorphism {
    public static void main(String[] args) {
        Carro car = new Carro();
        Bycicle bicycle = new Bycicle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle,boat};

        for (Vehicle racer : racers){
            racer.go();
        }
    }
}
