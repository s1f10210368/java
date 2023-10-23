public class Button {
    private String label;
    private boolean pressed;
    public static int numPressed = 0;

    // 引数を取るコンストラクタ
    public Button(String label) {
        this.label = label;
        this.pressed = false; // pressed の初期値は false
    }

    // 引数を取らないコンストラクタ
    public Button() {
        this.label = "Untitled";
        this.pressed = false; // pressed の初期値は falseである
    }

    // ボタンを押す
    public void press() {
        pressed = true;
        numPressed++; // pressed が true の場合、numPressed を増やす
    }

    // ボタンを離す
    public void release() {
        if (pressed) {
            pressed = false;
            numPressed--; // pressed が true の場合、numPressed を減らす
        }
    }

    // インスタンス・メソッド: インスタンス・フィールド pressed の値を返す
    public boolean isPressed() {
        return pressed;
    }

    // スタティック・メソッド: スタティック・フィールド numPressed の値を返す
    public static int getNumPressed() {
        return numPressed;
    }
}
