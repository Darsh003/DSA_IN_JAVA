//time complexity O(n^2)
//space complexity O(1)

package ARRAY_SORT;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]) {
                //swap elements
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        insertionSort(arr);
        System.out.println("the sorted array using insertion sort is : ");
        System.out.println(Arrays.toString(arr));
    }
}
