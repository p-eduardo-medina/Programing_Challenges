public class Hero extends Person {
    String power;
    Hero(String name, int age, String power){
        super(name,age); //Hereda las propiedades de Person
        //super refers to the super class
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String toString(){
        return super.toString()+this.power;
    }
}
