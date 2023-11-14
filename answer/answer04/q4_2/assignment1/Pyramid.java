package assignment1;

public class Pyramid extends Figure {
    Pyramid(int height) {
        super(height);
        // superで必要なコンストラクタを呼び出しする
    }
}

/*Pyramid クラス
Figure クラスを継承する、ピラミッド型の図形を表すクラス。
int 型の引数を取るコンストラクタをもつ。このコンストラクタで生成されたインスタンスは、引数の値が height に設定される。
*/