package DSA_JAVA.Basics;
import java.util.Scanner;

public class print_digitOf_num {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int count = 0;

        int tempNum = num;
        while (tempNum > 0) {
            count++;
            tempNum = tempNum / 10; 
        }

        int divisor = (int)Math.pow(10, count - 1);

        while (divisor > 0) {
            System.out.println(num / divisor);
            num = num % divisor;
            divisor = divisor / 10;
        }
    }
}