package final2.two;

public class Main3 {
    public static void main(String args[]) {
        ProductList pl = new ProductList();
        pl.add(new Product("Cheese", "Food", 1000));
        
        pl.add(new DiscountProduct("Oranage", "Fruit", 200));
        System.out.println(pl.getPrice());
    }
}
