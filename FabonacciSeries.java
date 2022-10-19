import java.sql.SQLOutput;
import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        System.out.println("To calculate Fibonacci Series up to n numbers.");
        System.out.println("Please provide number n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        FiboSeries(n);
        in.close();
    }

    public static void FiboSeries(int n) {
        int n1 =0;
        int n2 =1;
        for (int i =2; i < n ; i++){
            int n3=n1+n2;
            n1 = n2 ;
            n2 = n3;
            System.out.println("n3 value:"+n3);
        }
    }
}
