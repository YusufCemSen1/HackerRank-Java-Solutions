
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static boolean isEvenOdd(int a) {

        if (a % 2 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (!isEvenOdd(n)) {
            System.out.println("Weird");
        }
        if(isEvenOdd(n)){
            if(2<n && n<5){
                System.out.println("Not Weird");
            }
            if(6<=n && n<=20){
                System.out.println("Weird");
            }
            if(n>20){
                System.out.println("Not Weird");
            }
        }


    }
}