public class Test25_Static {
    public static void main (String[] args){

        Friend friend1 = new Friend("Sponge Bob");
        Friend friend2 = new Friend("Patrick Star");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numberofFriends);
        Friend.displayFriends();
        
        
    }
}
