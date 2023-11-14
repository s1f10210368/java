package answer.answer06.quiz;

public final class AdvancedMachine extends Machine{
    private static int total = 0;

    public AdvancedMachine(String model, int price) {
        super(model, price);
        total += price;
    }

    public static int getTotalPrice() {
        return total;
    }

    @Override
    public int getPrice() {
        return (int)(price * 1.1);
    }
}

/*スタティック・メソッド int getTotalPrice() は、すべての AdvancedMachine インスタンスの値段の合計を返す。
インスタンス・メソッド int getPrice() は、消費税込みの値段を返す。（消費税率は10%とする。）
このクラスのサブクラスを宣言することはできない。
このクラスで宣言されたフィールドは、他のクラスからアクセスすることはできない。
このクラスで宣言されたコンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
*/