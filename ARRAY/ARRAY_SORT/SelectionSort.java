//time complexity O(n^2)
//space complexity O(1)

package ARRAY_SORT;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int min_index = i;
            for(int j  = i+1;j<n;j++){
                if (arr[j]<arr[min_index]) {
                    min_index = j;
                }
            }
            if(min_index != i){
                //swap elements 
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        selectionSort(arr);
        System.out.println("the sorted array using selection sort is : ");
        System.out.println(Arrays.toString(arr));
    }
}

