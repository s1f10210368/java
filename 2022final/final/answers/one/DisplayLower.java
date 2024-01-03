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