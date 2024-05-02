// Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
// its just left and just right neighbor.

public class AssignmentQ5 {
    public static void main(String[] args) {
        int arr[]={1,4,7,8,2,6,5};
        int n=arr.length;

        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("the first peak element in the array is " + arr[i]);
                break;
            }
        }
    }
}