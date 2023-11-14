package midexam;

public class Product {
    static int id;
    final String name;
    final double weight;

    public Product(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public void print(){
        id++;
        System.out.println("No. %s: %d (weight: %s)", id, name, weight);
    }

    public static int count(){
        return id;
    }
}
