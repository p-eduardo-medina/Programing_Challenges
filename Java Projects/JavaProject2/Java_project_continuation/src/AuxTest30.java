

public class AuxTest30 {

    private String name, alias;
    private int age;
    
    AuxTest30(String name, String alias, int age){
        this.name = name;
        this.alias = alias;
        this.age = age;
    }
    AuxTest30(AuxTest30 x){
        this.copy(x); //We  Recive the information from x to this object
    }


    public void setname(String InputName){
        this.name = InputName;
    }
    public void setalias(String Inputalias){
        this.alias = Inputalias;
    }
    public void setnage(int Inputage){
        this.age = Inputage;
    }

    public String getname(){
        return this.name;
    }

    public String getalias(){
        return this.alias;
    }
    public int getage(){
        return this.age;
    }

    public void copy(AuxTest30 x){
        this.setnage(x.getage());
        this.setalias(x.getalias());
        this.setname(x.getname());
    }


}
