import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        System.out.println("To find Armstrong Number between two given number.");
        System.out.println("Please provide number:");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        AmstrongNumber(n1, n2);
        in.close();
    }

    public static void AmstrongNumber(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            int lastV, temp,sum =0;
            temp = i;
            while(temp != 0) {
                lastV = temp % 10;
                sum += Math.pow(lastV,3);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println("These are the  Amstrong num:" + i);
            }
        }
    }
}
