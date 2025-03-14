public class Seven_Boom_2 {
       /*
     * Create a function that takes an array of numbers and return "Boom!"
     *  if the digit 7 appears in the array.
     *  Otherwise, return "there is no 7 in the array".
     */
    public static void main(String[] args)  {
        System.out.println();
        Integer[]  arr1 = {1, 2, 3, 4, 5, 6, 7} ,arr2 = {8, 6, 33, 100}, arr3 = {2, 55, 60, 97, 86};
        sevenBoom(arr1);
        sevenBoom(arr2);
        sevenBoom(arr3);
        };
    

    public static  void sevenBoom(Integer[] array) {
        String response =  "there is no 7 in the array";
        for(Integer x:array){
            while (true){                
                if(x%10 == 7){
                    response = "Boom!";
                    break;
                }
                if(x<10){break;}
                float xAux = (float)x;
                x = (int) Math.round(xAux/10);
            }
            if(response=="Boom!"){break;}
        }
        System.out.println(response);
        System.out.println();
    }

    
}
