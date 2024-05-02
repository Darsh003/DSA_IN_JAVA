package DSA.RECURSION;

public class BinarySearch {
    public static int binarySearch(int arr[],int low,int high,int find){
        int result = -1;
       
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid]== find){
                return mid;
            }
            else if(arr[mid]<find){
               return binarySearch(arr, mid+1,high, find);
            }
            else{
               return binarySearch(arr, low, mid-1, find);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int find = 8;
        int high = arr.length-1;
        int low = 0;
        int result = binarySearch(arr,low,high,find);
        
        if(result == -1){
            System.out.println("element not present");
        }
        else{
        System.out.println("element fount at position : " + result);
        }
    }
}
