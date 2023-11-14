package assignment1;

public class Figure {
    final int height;

    Figure(int height) {
        this.height = height;
    }
}

/*Figure クラス
高さをもつ図形を表す。
int 型のインスタンス・フィールド height をもつ。この値はコンストラクタからしか設定できない。
int 型の引数を取るコンストラクタをもつ。このコンストラクタで生成されたインスタンスは、引数の値が height に設定される。
*/