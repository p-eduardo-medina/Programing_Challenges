public class Test20_Constructors {

    public static void main(String[] args){
        
        Human humano1 = new Human("Rick Sanchez", 65, 70);
        Human humano2 = new Human("Morty Smith", 15, 50);

        System.out.println(humano2.name);
        System.out.println(humano1.name);

        humano2.drinking();
        humano1.eat();

    }
    
}
