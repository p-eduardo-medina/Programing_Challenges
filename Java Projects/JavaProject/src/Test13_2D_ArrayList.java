import java.util.ArrayList;

public class Test13_2D_ArrayList {
    public static void main (String[] args){

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Bread");
        bakeryList.add("Donuts");

        ArrayList<String> productList = new ArrayList<String>();
        productList.add("Tomatoes");
        productList.add("Zucchini");
        productList.add("Peppers");

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("Water");
        drinkList.add("Soda");
        

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinkList);
        System.out.println(groceryList.get(1).get(1) );
    }
}
