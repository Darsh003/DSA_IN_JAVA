//time complexity is O(k*m*n) ---> k is the no of queriesthat i we will ask
//space complexity O(1)

import java.util.*;

public class PrefixSumBruteForce{
    public static int prefixSum(int arr[][],int r1,int r2,int c1,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum += arr[i][j];
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

        return sum;
    }

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

        int r1,r2,c1,c2;
        System.out.println("enter r1");
        r1 = s.nextInt();
        System.out.println("enter c1");
        c1 = s.nextInt();
        System.out.println("enter r2");
        r2 = s.nextInt();
        System.out.println("enter c2");
        c2 = s.nextInt();

        int result = prefixSum(arr,r1,r2,c1,c2);
        System.out.println(result);

        s.close();
    }
}