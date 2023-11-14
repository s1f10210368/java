package midexam;

import java.lang.Math;

public class One {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please input numbers.");
        } else {
            int sum = 0;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                sum += Math.pow(num, 3);
            }
            System.out.println(sum);
        }
    }
}
