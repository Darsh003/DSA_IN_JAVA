//this problem can be easily solved using fibonacci series

package DSA.RECURSION;

import java.util.Scanner;

public class CountStairWays {
    public static int noOfWays(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        else{
            return noOfWays(n-1) + noOfWays(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number of Steps : ");
        int num = s.nextInt();

        int result = noOfWays(num+1);
        System.out.println(result);
        s.close();
    }
}
