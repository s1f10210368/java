package three;

public class Circle extends Shape {
    public Circle(double size) {
        super(size);
    }

    public double area() {
        return size * size * Math.PI;
    }
}

/*
 * パッケージ three に、Shape を継承し、円を表す public なクラス Circle を宣言しなさい。

コンストラクタ Circle(double size) をもつ。
図形のサイズを円の半径とみなし、 double area() は円の面積を返す。
円周率は Math.PI を用いること。
コンストラクタおよびインスタンス・メソッドは、どのクラスからもアクセスすることができる。
 */