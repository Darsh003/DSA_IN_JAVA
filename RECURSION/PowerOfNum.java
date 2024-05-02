package DSA.RECURSION;

import java.math.BigInteger;
import java.util.Scanner;


public class PowerOfNum {
    // public static int powerOfNum_BruteForce(int n,int p) {
    //     // Approach 1
    //     // time complexity : O(p)
    //     if(p==1){
    //         return n;
    //     }

    //     return n * powerOfNum_BruteForce(n, p-1);
    // }

    public static BigInteger powerOfNum_Optimized(BigInteger n,int p) {
        // Approach 2  :  Divide And Conquer
        // time complexity : O(log(b))
        if(p==1){
            return n;
        }
        else{
            BigInteger res = powerOfNum_Optimized(n, p/2);
            BigInteger finalres = res.multiply(res);
            
            if(p % 2 == 0){
                // System.out.println(finalres);
                return finalres;
            }
            else{
                // System.out.println(finalres);
                return finalres.multiply(n);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        BigInteger n = s.nextBigInteger();
        System.out.println("enter power : ");
        int b = s.nextInt();

        // int result_BruteForce = powerOfNum_BruteForce(n,b);

        // System.out.println(n + " ^ " + b + " = " + result_BruteForce);


        BigInteger result_Optimized = powerOfNum_Optimized(n,b);

        System.out.println(n + " ^ " + b + " = " + result_Optimized);

        s.close();
    }
}
