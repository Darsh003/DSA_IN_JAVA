// Q5: Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

import java.util.Scanner;

public class AssignmentQ5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the no of rows and columns (please enter odd no)");
        int m = s.nextInt();

        int n = m;

        int arr[][] = new int[m][n];

        System.out.println("enter the elements of matrix : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j == n/2){
                    System.out.print(arr[i][j]);
                }
                if(i == m/2){
                    System.out.print(arr[i][j]);
                }
            }
        }

        s.close();
    }
}
