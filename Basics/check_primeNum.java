package DSA_JAVA.Basics;

import java.util.Scanner;

public class check_primeNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {
            int num = scn.nextInt();
            int count  = 0;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}