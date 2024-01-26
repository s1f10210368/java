package two;

public class Beer extends Beverage{
    public Beer(String name, int price) {
        super(name, price);
    }

    public int getPriceWithTax() {
        return (int)(price * 1.1);
    }    
}
