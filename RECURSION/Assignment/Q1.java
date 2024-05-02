package DSA.RECURSION.Assignment;

import java.util.Scanner;

public class Q1 {
    public static int sumOfDigits(int n){
        if(n==0){
            return n;
        }
        return ((n % 10) + sumOfDigits(n/10));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = s.nextInt();

        int res = sumOfDigits(n);

        System.out.println("the sum of Digits of Number " + n + " is : " + res);
        s.close();
    }
}
