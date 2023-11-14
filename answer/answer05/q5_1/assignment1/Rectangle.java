package q5_1.assignment1;

public class Rectangle extends Figure{
    final int width;

    Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }

    void draw() {
        for(int i = 0; i < height; i++) {
            String s = "*".repeat(width);
            System.out.println(s);
        }
    }
}

// Rectangle クラス
// 高さ heigth 、幅 width の長方形を、動作例の通りに出力する。
