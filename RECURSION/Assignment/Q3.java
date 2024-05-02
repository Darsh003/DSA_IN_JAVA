package DSA.RECURSION.Assignment;

public class Q3 {
    public static int maxValue(int[] arr,int length,int indx){
       
        if(indx == length-1){
            return arr[indx];
        }
        int max = arr[indx];
        int maxlater = maxValue(arr, length,indx+1);
        if(max<maxlater){
            max = maxlater;
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {133,1000,300,5000,202};
        int length = arr.length;
        int res = maxValue(arr,length,0);

        System.out.println("max valiue is : " + res);
    }
}
