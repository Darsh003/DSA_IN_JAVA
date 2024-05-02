// Q3. WAP to sort an array in decreasing order using insertion sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

package ARRAY_SORT;

import java.util.Arrays;

public class AssignmentQ3 {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int j = i;
            while (j>0 && arr[j]>arr[j-1]) {
                //swap elements
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        insertionSort(arr);
        System.out.println("the sorted array using insertion sort is : ");
        System.out.println(Arrays.toString(arr));
    }
}
