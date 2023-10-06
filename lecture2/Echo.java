package lecture2;

public class Echo {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.err.println("引数がありません。");
        }
    }
}
