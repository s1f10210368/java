import java.util.Scanner;

public class kuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1から9の数字を入力してください: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 9) {
            System.out.println(number + "の段の九九表:");

            for (int i = 1; i <= 9; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        } else {
            System.out.println("1から9の数字を入力してください。");
        }

        scanner.close();
    }
}