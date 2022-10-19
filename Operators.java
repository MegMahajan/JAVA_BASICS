import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int operation = 0;
        char operator = in.next().charAt(0);
        calculator(num1,num2,operator,operation);
        in.close();


    }

    public static void calculator(int num1, int num2, char operator, int operation) {
        if (operator == '+') {
            operation = num1 + num2;
            System.out.println("Addition : " + operation);
        } else if (operator == '-') {
            operation = num1 - num2;
            System.out.println("Substraction: " + operation);
        } else if (operator == '*') {
            operation = num1 * num2;
            System.out.println("Multiplication: " + operation);
        } else if (operator == '/') {
            if (num2 != 0) {
                operation = num1 / num2;
                System.out.println("division :" + operation);
            }
        } else {
            System.out.println("Invalid operation");

        }
    }

}
