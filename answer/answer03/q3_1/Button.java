public class Button {
    // ボタンの名称を表す String 型のインスタンス・フィールド label をもつ。
    String label;

    // ボタンが押されているか否かを表す boolean 型のインスタンス・フィールド pressed をもつ。
    // どのコンストラクタで生成されたインスタンスも、 pressed の初期値は false となる。
    boolean pressed = false;

    // 生成された全てのボタンのうち、 pressed の値が true であるものの個数を表す、 
    // int 型のスタティック・フィールド numPressed をもつ。
    static int numPressed = 0;

    // String 型の値を引数に取るコンストラクタをもつ。
    // このコンストラクタで生成されたインスタンスは、引数の値が label に設定される。
    Button(String label) {
       this.label = label;
    }
    // 引数を取らないコンストラクタをもつ。
    // このコンストラクタで生成されたインスタンスは、 label の値は Untitled になる。
    Button() {
        this("Untitled");
    }

    // 引数も返り値もないメソッド press をもつ。
    // このメソッドを呼び出すと、 pressed の値は true になる。
    void press() {
        if(! this.pressed) {
            numPressed++;
        }
        this.pressed = true;
    }

    // 引数も返り値もないメソッド release をもつ。
    // このメソッドを呼び出すと、 pressed の値は false になる。
    void release() {
        if(this.pressed) {
            numPressed--;
        }
        this.pressed = false;
    }
}