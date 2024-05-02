package DSA.RECURSION.Assignment;

public class Q4 {
    public static int sumOfArr(int[] arr,int length,int indx){
       
        if(indx == length-1){
            return arr[indx];
        }

        return arr[indx] + sumOfArr(arr, length, indx+1);
    }
    public static void main(String[] args) {
        int[] arr = {100,1,2,3,4,200};
        int length = arr.length;
        int res = sumOfArr(arr,length,0);

        System.out.println("sum of array is : " + res);
    }
}
