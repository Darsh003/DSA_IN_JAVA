//time complexity : O(log(n))
//space complexity : O(1)
//modification of binary search

package ARRAY_SEARCH;

import java.util.Scanner;

// finding the first occurence of the element is known as LowerBound (consider that elemnts are in increasing order)


public class LowerBound {
    public static int findFirstOccurence(int[] arr,int target){
        int high = arr.length -  1, low = 0,result = -1;

        while (low<=high) {
            int mid = low + (high-low)/2;  //we canalso use (low+high)/2 but to avoid overflow we this is recommended
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  //transverse left part
            }
            else if(arr[mid]<target){
                low = mid + 1;  //transverse right part
            }
            else{
                high = mid - 1;  //transverse left part
            }
        }
        return result;
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

        int result = findFirstOccurence(arr,x);

        if(result == -1){
            System.out.println("targeted element is not in the array");
        }
        else{
            System.out.println("targeted element found at Index : "+result);
        }
        s.close();
    }
}
