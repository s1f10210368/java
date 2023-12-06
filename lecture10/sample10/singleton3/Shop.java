package lecture10.sample10.singleton3;

import java.util.List;
import java.util.ArrayList;

public class Shop {
    private List<Item> items = new ArrayList<Item>();

    public Shop() {
    }

    public void register(Item item) {
        items.add(item);
    }

    public Item buy(Customer customer, String name) {
        FileLogger logger = FileLogger.getInstance();

        Item matched = null;
        for(Item item : items) {
            if(item.getName().equals(name)) {
                matched = item;
                break;
            }
        }
        if(matched == null) {
            logger.error(customer, String.format("%s is not found.", name));
            return null;
        }

        Seller seller = matched.getSeller();
        int price = matched.getPrice();
        if(customer.getBalance() < price) {
            logger.error(customer, String.format("Not enough moeny to buy %s.", name));
            return null;
        }
        
        seller.transfer(price);
        customer.withdraw(price);
        
        items.remove(matched);
        logger.purchase(customer, matched);
        
        return matched;
    }
}