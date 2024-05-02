package DSA.RECURSION;

//time complexity : O(2^n) i.e. exponential complexity
//space complexity : O(n)

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacciSeries(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        else{
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = s.nextInt();

        int result = fibonacciSeries(num);
        System.out.println(result);
        s.close();
    }
}
