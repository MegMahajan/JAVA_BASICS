import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println("Take 2 numbers as input and print the largest number.");
        Scanner in =new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        LargestNumMethod(num1,num2);
        in.close();
    }

    public static void LargestNumMethod(int num1, int num2) {
        System.out.println("Largest num btwn the two given number");
        if(num1 > num2)
            System.out.println("This is the largest value : "+num1);
        else
            System.out.println("This is the largest value : "+num2);
    }
}
