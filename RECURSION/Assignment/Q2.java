package DSA.RECURSION.Assignment;

public class Q2 {
    public static int alternateSignSum(int n) {
        if(n == 1){
            return 1;
        }
        if(n % 2 == 0){
            return alternateSignSum(n-1) - n;
        }
        else{
            return alternateSignSum(n-1) + n;
        }
    }

    public static void main(String[] args) {
        int n = 5; //can also take input
        
        int res = alternateSignSum(n);

        System.out.println("the alternate calculation of given num is : " + res);
    }
}
