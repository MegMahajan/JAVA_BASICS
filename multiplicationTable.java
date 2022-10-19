import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("Take a number as input and print the multiplication table for it.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prod = 0;
        multiTable(n,prod);
        in.close();
    }

    public static void multiTable(int n,int prod) {
        for (int i = 1; i <= 10; i++) {
            prod = n * i;
            System.out.println("multiplication table of "+n+" is :"+n+"*"+i+"="+prod);
        }

    }
}
