package midexam;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sbuf = new StringBuffer();
        for(;;) { 
            String str = scanner.nextLine(); 
            if(str.equals("END")) {
                break;
            }
            String lowstr = str.toLowerCase();
            sbuf.append(lowstr);
        }
        scanner.close();
        String result = sbuf.toString();
        System.out.printf(result);
    }
}


