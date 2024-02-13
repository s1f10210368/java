package final2.two;

public class Main2 {
    public static void main(String[] args) {
        Product p = new DiscountProduct("Oranage", "Fruit", 200);
        System.out.println(p.getName());
        System.out.println(p.getCategory());
        System.out.println(p.getPrice());
    }
}