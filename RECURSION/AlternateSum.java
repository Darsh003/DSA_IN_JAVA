package DSA.RECURSION;

import java.util.Scanner;

public class AlternateSum {
    public static int alternateSumFind(int n){
        if(n == 0){
            return 0;
        }
        else if(n % 2 == 0){
            return alternateSumFind(n-1)-n;
        }
        else{
            return alternateSumFind(n-1)+n;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int result = alternateSumFind(num);

        System.out.println("the result is : "+result);

        s.close();
    }
}
