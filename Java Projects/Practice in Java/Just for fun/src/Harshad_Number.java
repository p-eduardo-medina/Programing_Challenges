public class Harshad_Number {
    /*
     *  A number is said to be Harshad if it's exactly
     *  divisible by the sum of its digits. 
     *  Create a function that determines whether
     *  a number is a Harshad or not.
     */
    public static void main(String[] args) {
        System.out.println(isHarshad(75));
        System.out.println(isHarshad(171));
        System.out.println(isHarshad(481));
        System.out.println(isHarshad(89));
        System.out.println(isHarshad(516));
        System.out.println(isHarshad(200));
    }

    public static boolean isHarshad(int Num){
        int sum = 0, savedNum = Num;
        while (true) {
            if(Num<10){
                sum+=Num;
                break;
            }         
            else{
                sum += Num%10;
                Num = (int)Num/10;
            }      
        }
        if(savedNum%sum==0){
            return true;
        }
        return false;
    }
    
}
//JavaScript Projects/Basics of JS/Amzon Project/AmazonChime-5.23.22297.dmg