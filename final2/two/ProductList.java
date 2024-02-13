package final2.two;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products = new ArrayList<Product>();

    public ProductList(){
    }

    public void add(Product p){
        products.add(p);
    }

    public int getPrice(){
        int price = 0;
        for (Product p : products){
            price += p.getPrice();
        }
        return price;
    }
}
