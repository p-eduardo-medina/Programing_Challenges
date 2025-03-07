public class Test17_Printf {
    public static void main (String[] args){
    
        System.out.printf("\nThis is a format string %d",123);
        System.out.printf("\n%d This is a format string",123);
        System.out.printf("\nThis is a %d format string ",123);

        Boolean myBoolean = true;
        char myChar = '&';
        String myString = "Lalo";
        int myInt = 25;
        double myDouble = Math.PI;

        System.out.printf("\n%b",myBoolean);
        System.out.printf("\n%c",myChar);
        System.out.printf("\n%s",myString);
        System.out.printf("\n%d",myInt);
        System.out.printf("\n%f",myDouble);

        System.out.printf("\nHello %10s", myString);

        System.out.printf("\nmyDouble is: %.3f", myDouble);
        System.out.printf("\nmyDouble is: %,f", myDouble);
        System.out.printf("\nmyDouble is: %f and myString is %s.\n", myDouble,myString);
    }
}
