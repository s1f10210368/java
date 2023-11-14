package midexam;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Coffee", 180.0);
        Product p2 = new Product("Milk", 200.0);
        p1.print();
        p2.print();
        System.out.println(Product.count());
    }
}