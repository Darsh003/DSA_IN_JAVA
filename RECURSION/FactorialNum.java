package DSA.RECURSION;

//time complexity : O(n)
//space complexity : O(n)

import java.util.Scanner;

public class FactorialNum{
    public static int factorialNum(int num){
        int result =0;
        if(num == 0 || num == 1){
            return 1;
        }
        else if(num < 0){
            return -1;
        }
        else{
            result = num * factorialNum(num-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("please enter  number : ");
        int num = s.nextInt();
        int result  = factorialNum(num);
        if(result == -1){
            System.out.println("please enter positive value.");
        }
        else{
            System.out.println("factorial of given number is : " + result);
        }
        s.close();
    }
}