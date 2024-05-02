// Q4: Write a program to find the largest element of a given 2D array of integers.

import java.util.Scanner;

public class AssignmentQ4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the no of rows");
        int m = s.nextInt();

        System.out.println("enter the no of columns");
        int n = s.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("enter the elements of matrix : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }

        int max_num = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>max_num){
                    max_num = arr[i][j];
                }
            }
        }
        System.out.println("the latgest no int the given array is : " + max_num);
        s.close();
    }
}