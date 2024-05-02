package DSA.RECURSION;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfNum(int n){
        
        if (n <= 0) {
            return 0;    
        }
        return (n % 10 + sumOfNum(n/10));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = s.nextInt();

        int result = sumOfNum(num);

        System.out.println("Sum of your Number is : " + result);
        s.close();
    }    
}
