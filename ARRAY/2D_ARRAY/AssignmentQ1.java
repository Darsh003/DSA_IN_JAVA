//Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
    // number of positive numbers
    // number of negative numbers
    // number of odd numbers
    // number of even numbers
    // number of 0.

import java.util.Scanner;

public class AssignmentQ1 {
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

        int positive = 0,negative = 0,even = 0,odd = 0,zero = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>0){
                    positive++;
                }
                if(arr[i][j]<0){
                    negative++;
                }
                if(arr[i][j]==0){
                    zero++;
                }
                if(arr[i][j]%2 == 0){
                    even++;
                }
                if(arr[i][j]%2 != 0){
                    odd++;
                }  
            }
        }

        System.out.println("number of positive numbers is : " + positive);
        System.out.println("number of negetive numbers is : " + negative);
        System.out.println("number of even numbers is : " + even);
        System.out.println("number of odd numbers is : " + odd);
        System.out.println("number of zero's  is : " + zero);

        s.close();
    }
}
