import java.util.Scanner;

public class AddInteger {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Please provide input for first number:");
        int num1 = in.nextInt();
        System.out.println("Please provide input for sec number :");
        int num2 = in.nextInt();
        int totalSum = sumNum(num1,num2);
        System.out.println("The total sum of two numbers are : "+totalSum);
    }

    public static int sumNum(int num1, int num2) {
        return (num1 + num2);
    }
}
