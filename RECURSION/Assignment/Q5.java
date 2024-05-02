package DSA.RECURSION.Assignment;

public class Q5 {
    public static int isArmstrong(int n){
      if(n == 0){
        return 0;
      }

      return ((n%10)*(n%10)*(n%10)) + isArmstrong(n/10);
    }
    public static void main(String[] args) {
        int n = 153;

        int res = isArmstrong(n);
        if(res == n){
        System.out.println("the given number " + n + " is an Armstrong number");
        }
        else{
            System.out.println("the given number is not an Armstrong number");
        }
    }
}
