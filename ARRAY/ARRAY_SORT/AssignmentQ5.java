// Q5. Find out the number of iterations to sort the array in descending order using selection sort.
// Input Array {3,5,1,6,0}

package ARRAY_SORT;


public class AssignmentQ5 {
     public static int selectionSort(int[] arr){
        int n = arr.length;
        int count = 0;
        int swap = 0;
        for(int i = 0;i<n;i++){
            int Max_index = i;
            for(int j  = i+1;j<n;j++){
                if (arr[j]>arr[Max_index]) {
                    Max_index = j;
                    swap++;
                }
                count++;
            }
            if(Max_index != i){
                //swap elements 
                int temp = arr[Max_index];
                arr[Max_index] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("number of swappings done : "+swap);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        int iterations=selectionSort(arr);
        System.out.println("iterations required to sort arry is : "+iterations);
    }
}
