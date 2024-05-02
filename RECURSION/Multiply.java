package DSA.RECURSION;

import java.util.Scanner;

public class Multiply {
    public static void printMulti(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        
        printMulti(n, k-1);
        System.out.println(n*k);
    }
        
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print("Enter a number you want to multiply : ");
        int num = s.nextInt();
        System.out.print("How many times you want to multiply ?  : ");
        int k = s.nextInt();

        printMulti(num,k);

        s.close();
    }
}