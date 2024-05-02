// time complexity O(n^2)
// space complexity = O(1)

public class DuplicateNo {
    public static void main(String[] args) {
        int arr[]= {8,6,4,6,8,1,3};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("the duplicate element " + arr[i] + " is found at location " + j);
                }
            }
        }
    }
}
