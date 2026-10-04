package DSA_JAVA.Basics;
import java.util.Scanner;

public  class print_firstN_fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int j = -1;
        int k = 1;
        for (int i = 0; i < n; i++) {
            int fib = j+k;
            System.out.println(fib);
            j = k;
            k = fib;
        }
    }
}