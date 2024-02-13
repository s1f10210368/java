package three;

public abstract class Shape {
    protected final double size;
    public Shape(double size) {
        this.size = size;
    }

    public abstract double area();
}

/*
 * パッケージ three に、図形を表す publicな抽象クラス Shape を、以下の要件を満たすように宣言しなさい。

サイズを表す double 型のインスタンス・フィールド size をもつ。コンストラクタ以外で変更することはできず、サブクラスからアクセスすることができる。
コンストラクタ Shape(double size) をもち、引数を対応するインスタンス・フィールドに設定する。
図形の面積を返す抽象メソッド double area() をもつ。
コンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
 */