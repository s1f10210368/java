import java.util.Random;

public class Area {
    public static void main(String[] args) {
        // ランダムな整数を生成 (0以上10未満)
        int radius = getRandomInteger(0, 10);

        // 半径を表示
        System.out.println("半径: " + radius);

        // 円の面積を計算
        double area = calculateCircleArea(radius);

        // 面積を表示
        System.out.println("円の面積: " + area);
    }

    // 指定された範囲内でランダムな整数を生成するメソッド
    private static int getRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    // 円の面積を計算するメソッド
    private static double calculateCircleArea(int radius) {
        return Math.PI * radius * radius;
    }
}
