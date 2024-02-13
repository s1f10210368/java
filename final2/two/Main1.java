package final2.two;

public class Main1 {
    public static void main(String[] args) {
        Product p = new Product("Cheese", "Food", 1000);
        System.out.println(p.getName());
        System.out.println(p.getCategory());
        System.out.println(p.getPrice());
    }
}