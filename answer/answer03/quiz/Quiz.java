public class Quiz {
    public static void main(String[] args) {
        System.out.println(appendAll(args));
    }

    // String 型の配列を引数に取り、
    // 末尾に ; を加えて連結した文字列を返すスタティック・メソッド appendAll を作成しなさい。
    public static String appendAll(String[] args) {
        StringBuffer sb = new StringBuffer();
        for(String s : args) {
            sb.append(s);
            sb.append(";");
        }
        return sb.toString();
    }
}
