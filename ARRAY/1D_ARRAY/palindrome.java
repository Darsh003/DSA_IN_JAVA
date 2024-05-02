//Time Complexity = O(n)
//Space Complexity = O(1)

public class palindrome {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,2,1};
        int n = arr.length;
        int flag = 0;

        for(int i=0;i<(n-1);i++){
            if(arr[i]!=arr[n-i-1]){
                flag = 1;
                System.out.println("array is not palindrome");
                break;
            }
        }
        if(flag == 0){
            System.out.println("array is palindorme");
            }
    }    
}