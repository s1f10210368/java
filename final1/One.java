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
