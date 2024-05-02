//binary search  - only used whaen arry is in sorted order
//consider array in increasing order for this program
//time complexity : O(log(n))
//space complexity : O(1)


package ARRAY_SEARCH;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr,int target){
        int high = arr.length -  1, low = 0;

        while (low<=high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid]<target){
                low = mid + 1;  //transverse right part
            }
            else{
                high = mid - 1;  //transverse left part
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        // take an array element form the user
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array(Please write in increasing order)");
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();            
        }
        System.out.print("enter the element to search : ");
        int x = s.nextInt();

        int result = binarySearch(arr,x);

        if(result == 0){
            System.out.println("targeted element is not in the array");
        }
        else{
            System.out.println("targeted element found at Index : "+result);
        }
        s.close();
    }
}
