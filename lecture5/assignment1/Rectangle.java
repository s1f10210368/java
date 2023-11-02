package assignment1;

class Rectangle extends Figure {
    int width;

    public Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }

    @Override
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}