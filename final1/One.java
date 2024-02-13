public class One {
    public static void main(String args[]) {
        if(args.length > 0) {
            int result = 0;
            for (String s : args) {
                if(s.length() > result) {
                    result = s.length();
                }
            }
            System.out.println(result);
        }
    }    
}

/*
 * java コマンドの引数で文字列の列を与えると、最も長い文字列の長さを表示する。
java コマンドの引数がない場合は、何も表示しない。
 */