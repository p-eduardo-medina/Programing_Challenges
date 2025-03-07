public class MyGenericClass <Thing extends Number, Thing2 extends Number> { //Any kind of number for -> Thing
    Thing x;
    Thing2 y;
    MyGenericClass(Thing x, Thing2 y){
        
        this.x =x;
        this.y=y;

    }
    public Thing2 getValue(){
        return y;
    }
}
