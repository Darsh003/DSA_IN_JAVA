//to find the missing no subtract the sum of natural no form the sum of given array
// time complexity O(n)
// space complexity = O(1)

public class missingNo {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,6,7};
        int n = arr.length;

        int sum = ((n+1)*(n+2)/2);
        int arr_sum=0;

        for(int i=0;i<n;i++){
            arr_sum += arr[i];
        }

        int missingno = sum - arr_sum;
        System.out.println("missing no is : " + missingno);
    }
}
