import java.util.Scanner;

public class DisplayLower{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            String str = scanner.nextLine();
            if(str.length() == 0) {
                break;
            }
            System.out.println(str.toLowerCase());
        }
        scanner.close();
    }
}

/*
 * java コマンドの引数で文字列の列を与えると、最も長い文字列の長さを表示する。
java コマンドの引数がない場合は、何も表示しない。
 */