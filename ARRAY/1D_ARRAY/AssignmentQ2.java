// Q2: Write a program to traverse over the elements of the array using for each loop and print all even
// elements.
// Input 1: arr[] = {34,21,54,65,43}
// Output 1: 34 54

public class AssignmentQ2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int sum : arr) {
            if(sum%2 == 0){
            System.out.print(sum + " ");
        }
        }
    }
}
