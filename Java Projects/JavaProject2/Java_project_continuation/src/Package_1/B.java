package Package_1;

public class B {
    private String privateMessage = "This is private";
    /*
     * Only class B can see this object
     */
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.privateMessage);
    }
}
