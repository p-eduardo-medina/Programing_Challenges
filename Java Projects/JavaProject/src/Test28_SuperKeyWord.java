public class Test28_SuperKeyWord {

    public static void main(String[] args){
        Hero hero1 = new Hero("Batman",42,"$$");
        Hero hero2 = new Hero("Superman",43,"Kriptonian");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);

        System.out.println(hero1.toString());
    }
    
}
