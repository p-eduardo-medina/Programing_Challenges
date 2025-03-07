public class Test31_CopyObjects { //For copy Objects you need encapsulation
    
    public static void main(String[] args) {
        AuxTest30 var1 = new AuxTest30("Eduardo", "LAlo", 29);
        AuxTest30 var2 = new AuxTest30("Ignacio", "NAcho", 31);

        AuxTest30 var3 = new AuxTest30(var2);
        var2.copy(var1);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println();
        System.out.println(var1.getage());
        System.out.println(var1.getalias());
        System.out.println(var1.getname());
        System.out.println();
        System.out.println(var2.getage());
        System.out.println(var2.getalias());
        System.out.println(var2.getname());
        System.out.println();
        System.out.println(var3.getage());
        System.out.println(var3.getalias());
        System.out.println(var3.getname());


    }

}
