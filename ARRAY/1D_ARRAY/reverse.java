// time complexity O(n)
// space complexity = O(1)


public class reverse {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,13};
        int n = arr.length;

        for(int i=0;i<n/2;i++){
            //swap arr[i] with arr[n-i-1]
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp; 
        }
        System.out.println("reversal of array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
