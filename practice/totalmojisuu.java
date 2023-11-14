// ユーザーが空行を入力するまでテキストを読み取り、入力された文字列の合計文字数を計算し、最終的にその合計文字数を出力

package practice;

import java.util.Scanner;

public class totalmojisuu {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for(;;) { // 無限ループ
            String str = scanner.nextLine();
            if(str.isEmpty()) {
                break;
            }
            count += str.length();
        }
        System.out.println(count);
    }
}
