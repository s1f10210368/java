public class Combination {
    public static int combination(int n, int r) {
        if (r == 0 || r == n){
            return 1;
        }

        return (combination(n-1, r-1) + combination(n-1, r));
    }


    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        int c = combination(n, r);
        System.out.printf("C(%d, %d) = %d\n", n, r, c);
    }
}
