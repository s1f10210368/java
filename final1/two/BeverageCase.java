package two;

import java.util.List;
import java.util.ArrayList;

public class BeverageCase {
    private List<Beverage> beverages = new ArrayList<Beverage>();

    public BeverageCase() {
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public int getTotalPrice() {
        int total = 0;
        for (Beverage b : beverages) {
            total += b.getPriceWithTax();
        }
        return total;
    }
}

/*
 * パッケージ two に、以下の要件を満たすpublicなクラス BeverageCase を宣言しなさい。

このクラスは、飲み物のリストをインスタンスフィールドとして保持する。
インスタンス・メソッド void addBeverage(Beverage beverage) は、引数で与えた飲み物をリストに追加する。
インスタンス・メソッド int getTotalPrice() は、リストに追加された飲み物の税込価格の総額を返す。
このクラスで宣言されたフィールドは、他のクラスからアクセスすることはできない。
このクラスで宣言されたインスタンス・メソッドは、どのクラスからもアクセスすることができる。
 */