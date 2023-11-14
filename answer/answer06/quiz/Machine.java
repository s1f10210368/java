package answer.answer06.quiz;

public class Machine {
    // 全てのインタンス・フィールドは、コンストラクタ以外で変更することはできず、サブクラスからアクセスすることができる。
    protected final String model;
    protected final int price;

    // コンストラクタ
    public Machine(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
}

/*型番を表す String 型のインスタンス・フィールド model をもつ。
値段を表す int 型のインスタンス・フィールド price をもつ。
コンストラクタ Machine(String model, int price) をもち、引数を対応するインスタンス・フィールドに設定する。
インスタンス・メソッド String getModel() は、型番を返す。
インスタンス・メソッド int getPrice() は、値段を返す。
全てのインタンス・フィールドは、コンストラクタ以外で変更することはできず、サブクラスからアクセスすることができる。
コンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
*/