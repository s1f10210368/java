package two;

public class Beverage {
    private final String name;
    protected final int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPriceWithTax() {
        return (int)(price * 1.08);
    }
}
/*
 * パッケージ two に、飲み物を表わすpublicなクラス Beverage を、以下の要件を満たすように宣言しなさい。

名前を表す String 型のインスタンス・フィールド name をもつ。コンストラクタ以外で変更することはできず、他のクラスからアクセスすることはできない。
値段を表す int 型のインスタンス・フィールド price をもつ。コンストラクタ以外で変更することはできず、サブクラスからアクセスすることができる。
コンストラクタ Beverage(String name, int price) をもち、引数を対応するインスタンス・フィールドに設定する。
インスタンス・メソッド String getName() は、動作例のように、名前をそのまま返す。
インスタンス・メソッド int getPriceWithTax() は、動作例のように税込価格を返す。税率は8%とする。
コンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
 */