package assignment1;

public class Rectangle extends Figure{
    final int width;

    Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }
}

/*Rectangle クラス
Figure クラスを継承する、長方形を表すクラス。
int 型のインスタンス・フィールド width をもつ。この値はコンストラクタからしか設定できない。
int 型の引数を2つ取るコンストラクタをもつ。このコンストラクタで生成されたインスタンスは、第1引数の値が height に、第2引数の値が width に設定される。
*/