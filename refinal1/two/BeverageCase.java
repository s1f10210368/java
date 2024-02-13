package refinal1.two;

import java.util.ArrayList;
import java.util.List;

public class BeverageCase {
    List<Beverage> beverages = new ArrayList<Beverage>();

    public BeverageCase(){
    }

    public void addBeverage(Beverage beverage){
        beverages.add(beverage);
    }

    public int getTotalPrice(){
        int total = 0;
        for (Beverage b : beverages){
            total += b.getPriceWithTax();
        }
        return total;
    }
}
