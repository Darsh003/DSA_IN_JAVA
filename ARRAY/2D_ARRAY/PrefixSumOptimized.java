import java.util.Scanner;

public class PrefixSumOptimized {

    public static void finalMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        //transverse the matrix to calculate row prefixsum
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j] += arr[i][j-1];
            }
        }

        //transverse the matrix to calculate cloumn prefixsum
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }

    public static int prefixSum(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0,up=0,left=0,rep_region=0,res=0;

        sum=arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        rep_region = arr[r1-1][c1-1];

        res = sum-up-left+rep_region;
        return res;
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

        finalMatrix(arr);
        int result = prefixSum(arr,r1,c1,r2,c2);
        System.out.println(result);

        s.close();
    }
}
