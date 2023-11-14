//標準入力からの入力を受付け、空行が入力されるまでに入力された文字列をまとめて表示するクラス InputSample を宣言しなさい。

//文字列の組み立てには、StringBuffer を利用すること。

import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sbuf = new StringBuffer();
        for(;;) {
            String str = scanner.nextLine();
            if(str.length() == 0) {
                break;
            }
            sbuf.append(str);
            sbuf.append('\n');
        }
        scanner.close();
        String result = sbuf.toString();
        System.out.printf(result);
    }
}
