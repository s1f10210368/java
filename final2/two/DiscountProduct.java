package final2.two;

public class DiscountProduct extends Product{
    public double DISCOUNT_RATE = 0.3;

    public DiscountProduct(String name, String category, int price){
        super(name, category, price);
    }

    @Override
    public int getPrice(){
        return (int)(price * (1 - DISCOUNT_RATE));
    }
}

