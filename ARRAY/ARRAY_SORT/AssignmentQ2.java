// Q2. WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

package ARRAY_SORT;

import java.util.Arrays;

public class AssignmentQ2 {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int Max_index = i;
            for(int j  = i+1;j<n;j++){
                if (arr[j]>arr[Max_index]) {
                    Max_index = j;
                }
            }
            if(Max_index != i){
                //swap elements 
                int temp = arr[Max_index];
                arr[Max_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        selectionSort(arr);
        System.out.println("the sorted array using selection sort is : ");
        System.out.println(Arrays.toString(arr));
    }
}
