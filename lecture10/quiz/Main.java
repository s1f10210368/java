package lecture10.quiz;

public class Main {
    public static void main(String[] args)  {
        DeliciousFood apple = new DeliciousFood("Apple", 100);
        Book book = new Book("A book", 100);
        System.out.printf("%s %d\n", apple.getName(), apple.getTaxPrice());
        System.out.printf("%s %d\n", book.getName(), book.getTaxPrice());
    }
}