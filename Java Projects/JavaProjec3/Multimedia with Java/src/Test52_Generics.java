import java.util.ArrayList;

public class Test52_Generics {
    
    public static void main(String args[]) {
        Integer[]  intArray = {1,2,3,4,5};
        Double[] doubleArray ={5.5,4.4,3.3,2.2,1.1};
        Character[] charArray = {'H','E','L','L','O'};
        String[] stringArray = {"B","Y","E"};

        //displayArray2(intArray);
        //displayArray2(doubleArray);
        //displayArray2(charArray);
        //displayArray2(stringArray);
        //System.out.println(getFirst(intArray));
        //System.out.println(getFirst(doubleArray));
        //System.out.println(getFirst(charArray));
        //System.out.println(getFirst(stringArray));

        //You can do this with classes

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
        //MyGenericClass<Integer, String> myObj = new MyGenericClass<>(1, "Hello");

        ArrayList<String>  myFriends = new ArrayList<>();
        ArrayList<Integer>  myNums = new ArrayList<>();

        System.out.println(myInt.getValue());
    }    

    public static <Thing> void displayArray2(Thing[] array){
        for(Thing x : array){
            System.out.printf(x+" ");
        }
        System.out.println();
    }
    
    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }

    public static void displayArray(Integer[] array){
        for (Integer x : array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void displayArray(Double[] array){
        for (Double x : array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void displayArray(Character[] array){
        for (Character x : array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void displayArray(String[] array){
        for (String x : array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
            
}



