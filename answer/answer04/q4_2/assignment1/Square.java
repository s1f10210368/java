package assignment1;

public class Square extends Rectangle{
    Square(int height) {
        super(height, height);
    }
}

/*Square クラス
Rectangle クラスを継承する、正方形を表すクラス。
int 型の引数を取るコンストラクタをもつ。このコンストラクタで生成されたインスタンスは、引数の値が height と width に設定される。
*/