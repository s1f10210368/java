package q5_1.assignment1;

public class Figure {
    final int height;

    Figure(int height) {
        this.height = height;
    }

    void draw() {
        for(int i = 0; i < height; i++) {
            System.out.println("");
        }
    }
}

// Figure クラス
// 高さ heigth の空行を出力する。
