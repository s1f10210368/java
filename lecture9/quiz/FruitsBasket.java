package lecture9.quiz;

import java.util.ArrayList;
import java.util.List;

public class FruitsBasket {
    // フルーツを管理するリスト
    private List<Fruit> fruitsList;

    // コンストラクタ: リストの初期化
    public FruitsBasket() {
        fruitsList = new ArrayList<>();
    }

    // バスケットにフルーツを追加するメソッド
    public void add(Fruit fruit) {
        fruitsList.add(fruit);
    }

    // 追加されたフルーツの色を表示するメソッド
    public void print() {
        for (Fruit fruit : fruitsList) {
            System.out.println(fruit.getColor());
        }
    }
}
