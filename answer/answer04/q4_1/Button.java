// 前回のQ2で作成したクラス Button を、以下のようにしなさい。

public class Button {
    // インスタンス・フィールド label は、コンストラクタ以外から代入できない。
    // このフィールドは、任意のクラスからアクセスできる。
    public final String label;

    // label 以外の全てのフィールドは、他のクラスからアクセスできない。
    // privateをつけることで他のクラスからアクセスできなくなる
    private boolean pressed = false;
    private static int numPressed = 0;
    public Button(String label) {
       this.label = label;
    }
    public Button() {
        this("Untitled");
    }
    public void press() {
        if(! this.pressed) {
            numPressed++;
        }
        this.pressed = true;
    }
    public void release() {
        if(this.pressed) {
            numPressed--;
        }
        this.pressed = false;
    }

    // インスタンス・フィールド pressed の値を返すインスタンス・メソッド isPressed をもつ。引数は取らない。
    public boolean isPressed() {
        return pressed;
    }

    // スタティック・フィールド numPressed の値を返すスタティック・メソッド getNumPressed をもつ。引数は取らない。
    public static int getNumPressed() {
        return numPressed;
    }
}