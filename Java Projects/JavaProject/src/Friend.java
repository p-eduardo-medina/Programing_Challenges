public class Friend {
    String name;
    static int numberofFriends;
    Friend(String name){
        this.name=name;
        numberofFriends++;
    }

    static void displayFriends(){
        System.out.printf("\nYou have %d Friends now\n",numberofFriends);
    }
}
