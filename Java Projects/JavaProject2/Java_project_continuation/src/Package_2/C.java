package Package_2;
import Package_1.*;

public class C {

    public String publicMessage = "This is public";
        //Public makes posible to see in any package
    protected String protectedMessage = "This is protected";
        /*
         * Protected make visible to any class in any package as long as
         * that class is a subclass of whatever class contain this protected key
         */         
    //private String privateMessage = "This is private";
        /*
        * Only class B can see this object
         */
    String defaulMessa = "This is the default";

    
}
