public class Test10_Arrays {
    public static void main (String[] args) {
        String[] cars = {"Camaro","Corvete","Tesla"};
    //  Tipo de variable en Array [] nombre del Array = Array
        cars[0] = "Mustang";

        System.out.println(cars[0]);

        String[] cars_2 = new String[3];

        cars_2[0] = "CAmaro";
        cars_2[1] = "Corvete";
        cars_2[2] = "";        

        for(int i = 0; i< cars_2.length; i++){
            System.out.println(cars_2[i]);
        }

    /*
     *   2D Array
     */

    String[][]  matrix = new String[3][3];
    String[][]  matrix2 = {
                {"a","b","c"},
                {"a2","b2","c2"},
                {"a2","b2","c2"}
            };

    matrix[0][0] = "Camaro";   
    matrix[0][1] = "Corvete";   
    matrix[0][2] = "Tesla";  
    matrix[1][0] = "Ranger";   
    matrix[1][1] = "Ranger2"; 
    matrix[1][2] = "Ranger3";
    matrix[2][0] = "LAmbo";   
    matrix[2][1] = "LAmbo2"; 
    matrix[2][2] = "LAmbo3";

    for (int i = 0; i < matrix2.length;i++){
        System.out.println();
        for(int j = 0; j<matrix2[i].length;j++){
            System.out.print(" "+matrix2[i][j]);
        }
    }
     

    }
}
