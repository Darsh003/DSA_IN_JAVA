//linear search in 1d array
//time complexity : O(n)
//space complexity : O(1)

package ARRAY_SEARCH;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // take an array element form the user
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array");
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();            
        }
        System.out.print("enter the element to search : ");
        int x = s.nextInt();
        int index = -1;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==x){
                index = i;
            }
        }

        if(index == -1){
            System.out.println("targeted element is not in the array");
        }
        else{
            System.out.println("targeted element found at Index : "+index);
        }
        s.close();
    }
}
