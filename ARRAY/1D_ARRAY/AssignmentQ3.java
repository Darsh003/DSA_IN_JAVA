// Q3: Write a program to calculate the maximum element in the array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 65

public class AssignmentQ3 {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,-5};
        int n = arr.length;
        int max_num = Integer.MIN_VALUE;
//approach 1 -my soln
        for(int i=0;i<n;i++){
            if(arr[i]>max_num){
                max_num = arr[i];
            }
        }

        System.out.println("maximum no in the array is : " + max_num);


        max_num = Integer.MIN_VALUE;

//approach 2 - pw
        for (int val : arr) {
            max_num = Math.max(max_num, val);
        }
        System.out.print("Largest in given array is " + max_num);
    }
}
