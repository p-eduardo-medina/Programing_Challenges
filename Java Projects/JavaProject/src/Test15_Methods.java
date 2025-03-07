public class Test15_Methods {
    public static void main (String[] args){
        
        //int age = 29;
        int sum = suma(8,11);  
        System.out.println("\n"+sum);

    }

    static void hello(){
        System.out.println("\nHello World");
    }
    static void hello2(String varNAme){
        System.out.println("\nHello World to:" + varNAme);
    }
    static void hello3(String varNAme, int varAge){
        System.out.println("\nHello World to:" + varNAme);
        System.out.println("\nYour age is: " + varAge);
    }
    static int suma(int x, int y){
        return x+y;
    }
}
