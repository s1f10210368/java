package org.iniad.se.sample12.sample2;

public class Fib {
    /*public static int fib(int n) {
        if(n < 0) {
            throw new UnsupportedOperationException();
        }
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }*/

    public static int fib(int n) {
        if(n < 0) {
            throw new UnsupportedOperationException();
        }
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int f_2 = 0;
        int f_1 = 1;
        int f = 1;
        for(int i = 2; i <= n; i++) {
            f = f_1 + f_2;
            f_2 = f_1;
            f_1 = f;
        }
        return f;
    }
}
