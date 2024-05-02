// time complexity  = O(n^2)
// space complexity  =  O(1)

package ARRAY_SORT;

import java.util.Arrays;

public class BubbleSort{
    public static void bubbleSort(int[] arr){
        boolean swaped = false;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length - i - 1;j++){
                if(arr[j]>arr[j+1]){
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
        int[] arr = {12,23,34,23,5,3,34,1,0};

        bubbleSort(arr);

        System.out.println("the sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}