package lecture11.sample11.template2;

public class PyramidActivity extends Activity{
    protected void onStart() {
        System.out.println("PyramidActivity starts.");
    }
    protected void onStop() {
        System.out.println("PyramidActivity stops.");
    }
    protected void onInput(String input) {
        try {
            int n = Integer.parseInt(input);
            for(int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < n - i - 1; j++) {
                    sb.append(" ");
                }
                for(int j = 0; j < (i + 1) * 2; j++) {
                    sb.append("#");
                }
                System.out.println(sb.toString());
            }
        } catch (NumberFormatException e) {
            System.out.println("Input a number.");
        }
    }
}
