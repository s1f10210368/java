package final2.two;

public class Product {
    private final String name;
    private final String category;
    protected final int price;

    public Product(String name, String category, int price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public int getPrice(){
        return price;
    }
}
