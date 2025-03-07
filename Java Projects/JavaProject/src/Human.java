//Auxiliar code for Test20_Constructors

//Constructors must match the name of the class and the function.
public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weigh){//This is the constructor
            this.name   = name;
            this.age    = age;
            this.weight = weigh;
    }

    void eat(){
        System.out.println(this.name + " Is eating");
        /*
         * All variables in constructor can 
         * be callables by using the key word this.
         */
    }

    void drinking(){
        System.out.println(this.name + " Is drinking");

    }

}
