package sample10.singleton3;

public class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    public void withdraw(int amount) {
        balance -= amount;
        FileLogger.getInstance().balance(this);
    }

    public String getName() {
        return name;
    }
}