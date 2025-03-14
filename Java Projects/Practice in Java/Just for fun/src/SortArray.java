import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        Integer[]  arr1 = {7,6,5,4,3,3,2,2,1,0,-1,-2,-3,-4};
        for (int i=0; i<arr1.length;i++){
            for (int j=i; j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    Integer saveArr =  arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = saveArr;
                }      
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}
