import java.util.Scanner;

public class productInteger {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Please provide input for first number:");
        int num1 = in.nextInt();
        System.out.println("Please provide input for sec number :");
        int num2 = in.nextInt();

        int totalProduct = productNum(num1,num2);
        System.out.println("The total sum of two numbers are : "+totalProduct);

        in.close();
    }

    public static int productNum(int num1, int num2) {
        return (num1 * num2);
    }
}
