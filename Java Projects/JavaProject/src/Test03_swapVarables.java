public class Test03_swapVarables {
    public static void main (String[] args){
        String x = "water";
        String y = " Strawberry";
        String temp;


        temp = x+y;
        x = y;
        y = temp;
        System.out.println("x := " + x);
        System.out.println("y := " + y);
    }
}
