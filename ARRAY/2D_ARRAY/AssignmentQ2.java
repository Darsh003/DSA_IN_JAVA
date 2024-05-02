//Q2: write a program to print the elements above the secondary diagonal in a user inputted square matrix.

import java.util.Scanner;

public class AssignmentQ2 {
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

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i+j  <  (m-1)){
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }

        s.close();
    }
}
