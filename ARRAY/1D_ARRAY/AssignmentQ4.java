// Q4: Write a program to find out the second largest element in a given array.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 54

public class AssignmentQ4 {    
    public static void main(String[] args) {
        int arr[]={2,2,2,3};
        int n = arr.length;

        int sec_max_num = Integer.MIN_VALUE;
        int max_num = Integer.MIN_VALUE;
//approach 1 -my soln
        if(n<2){
            System.out.println("only one element in array");
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i]>max_num){
                    max_num = arr[i];
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i]>sec_max_num && arr[i]<max_num){
                    // if(arr[i]<max_num){
                        sec_max_num = arr[i];
                    // }
                }
            }
            if(sec_max_num == Integer.MIN_VALUE)
                System.out.println("there is no second largest value");
            else
                System.out.println("second maximum no in the array is : " + sec_max_num);
        }


    }
}
