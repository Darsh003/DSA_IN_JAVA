//problem : find the square root of the given number 
        // -> if the number is perfect square the print ans i.e. input = 16  output = 4
        // -> else print the floor vale i.e.  input = 13 output = 3

//Approach : modification ot binary search
// time complexity : O(log n)
// space complexity : O(1)


package ARRAY_SEARCH;

import java.util.Scanner;

public class SquareRoot {
    public static int findSquareRoot(int num){
        int low = 0,high = num,result =-1,mid=0;

        while(low<=high){
            mid = low + (high-low)/2;
            long val = mid*mid;

            if(num == val){
                return mid;
            }
            else if(val > num){
                high = mid-1;
            }
            else if(val < num){
                result = mid; //in case the number is not perfect square so we store the floor value
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find its square root : ");
        int num  = sc.nextInt();
        int result = findSquareRoot(num);

        System.out.println("the Square root of the given number is : " + result);
        sc.close();
    }
}
