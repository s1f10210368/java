package lecture10.sample10.singleton3;

public class Seller extends User {
    private String shopName;

    public Seller(String name, String shopName) {
        super(name);
        this.shopName = shopName;
    }

    public void transfer(int amount) {
        balance += amount;
        FileLogger.getInstance().balance(this);
    }

    public String getName() {
        return String.format("%s(%s)", shopName, name);
    }
}