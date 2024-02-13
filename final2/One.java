//標準入力からの入力を受付け、空行が入力されるまでに入力された文字列をまとめて表示するクラス InputSample を宣言しなさい。

//文字列の組み立てには、StringBuffer を利用すること。

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            String str = scanner.nextLine();
            if(str.length() > result) {
                result = str.length();
            }

            if (str.length() == 0){
                System.out.print(result);
            }
        }
        scanner.close();
        System.out.println(result);
    }
}
