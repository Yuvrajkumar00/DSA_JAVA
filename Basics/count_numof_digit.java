package DSA_JAVA.Basics;
import  java.util.Scanner;

public  class count_numof_digit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;    
        }

        System.out.println("The count of number is = " + count);
    }
}