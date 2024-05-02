// Q1. Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}


package ARRAY_SORT;

import java.util.Arrays;

public class AssignmentQ1 {
        public static void bubbleSort(int[] arr){
            boolean swaped = false;
    
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr.length - i - 1;j++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
    
                        swaped = true;
                    }
                }
                if(!swaped){
                    break;
                }
            }
        }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};

        bubbleSort(arr);

        System.out.println("the sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}