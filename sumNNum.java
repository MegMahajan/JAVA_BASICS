import java.util.Scanner;

public class sumNNum {
    public static void main(String[] args) {
        System.out.println("Find the sum of N natural number.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = sumOfNatural(n);
        System.out.println("sum of n natural number is:"+sum);
        in.close();
    }

    public static int sumOfNatural(int n) {
        return n * (n+1)/2;
    }
}
