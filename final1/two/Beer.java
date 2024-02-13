package two;

public class Beer extends Beverage{
    public Beer(String name, int price) {
        super(name, price);
    }

    public int getPriceWithTax() {
        return (int)(price * 1.1);
    }    
}

/*
 * パッケージ two に、Beverage クラスを継承し、以下の要件を満たすpublicなクラス Beer を宣言しなさい。

コンストラクタ Beer(String name, int price) をもち、引数を対応するインスタンス・フィールドに設定する。
インスタンス・メソッド int getPriceWithTax() は、動作例のように、税率10%の時の税込価格を返すようにオーバーライドされている。
このクラスで宣言されたコンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
 */