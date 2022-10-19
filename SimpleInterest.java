import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.");
        Scanner in =new Scanner(System.in);
        System.out.println("Please provide value of P,R & T");
        float p =in.nextFloat();
        float r =in.nextFloat();
        float t =in.nextFloat();
        float si = (p * r * t)/100;
        System.out.println("Simple interest is : "+si);


    }
}
