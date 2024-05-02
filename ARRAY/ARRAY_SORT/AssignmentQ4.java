//Q4. Find out how many pass would be required to sort the following array in decreasing order
// using bubble sort
// Input Array {3,5,1,6,0}

package ARRAY_SORT;

public class AssignmentQ4 {
     public static int bubbleSort(int[] arr){
            boolean swaped = false;
            int count = 0;
            int swap = 0;
    
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr.length - i - 1;j++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
    
                        swaped = true;
                        swap++;
                    }
                    count++;
                }
                if(!swaped){
                    break;
                }
            }
            System.out.println("number of swappings done : "+swap);
            return count;
        }
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};

        int pass=bubbleSort(arr);

        System.out.println("the passes required to sort array is : " + pass);
    }
}
