package lecture7.assignment1;

import lecture7.assignment1.figures.WritablePyramid;

public class Main {
    public static void main(String[] args) {
        WritablePyramid p = new WritablePyramid(4);
        p.draw();
        p.write("tmp.txt");
    }
}