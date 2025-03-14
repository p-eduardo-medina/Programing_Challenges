
public class Seven_Boom {

    /*
     * Create a function that takes an array of numbers and return "Boom!"
     *  if the digit 7 appears in the array.
     *  Otherwise, return "there is no 7 in the array".
     */
    public static void main(String[] args)  {

        Integer[]  intArray = {1,2,3,4,5};
        sevenBoom(intArray);
        };
    

    public static  <Thing> void sevenBoom(Thing[] array) {
        String response = "";
        for(Thing x:array){
            String s=String.valueOf(x);
            if(s == "7"){
                response = "BOOM!";
            }else{
                response = "there is no 7 in the array";
            }
        }
        System.out.println(response);
    }

    
}
