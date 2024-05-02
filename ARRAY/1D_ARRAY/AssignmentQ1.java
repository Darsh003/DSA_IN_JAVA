// Q1: Write a program to print the sum of all the elements present on even indices in the given array.
// Input 1: arr[] = {3,20,4,6,9}
// Output 1: 16

public class AssignmentQ1 {
    public static void main(String[] args) {
        int arr[] = {4,3,6,7,1};
        int n =arr.length;
        int even_sum = 0;
//Approach 1 - my soln        
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                even_sum += arr[i];
            }        
        }

        System.out.println("the sum of even indices of an array is : "+even_sum);

even_sum = 0;

//approach 2 - pw
        int i = 0;
        while (i < arr.length) {
            even_sum += arr[i];
            i+=2;
        }
        System.out.println(even_sum);

    }    
}
