import java.util.Scanner;

public class GCDLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter value for n1 :");
        int n1 = in.nextInt();
        System.out.println("Please enter value for n2 :");
        int n2 = in.nextInt();

        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;
        System.out.println("gcd :" + gcd);
        System.out.println("lcm :" + lcm);
    }
}
