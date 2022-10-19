import java.util.Scanner;

public class SumOfnotillX {
    public static void main(String[] args) {
        System.out.println("Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            if (in.hasNextInt()) {
                sum += in.nextInt();
            } else if (in.hasNext()) {
                if (in.next().toLowerCase() == "x") {
                    break;
                }
            }
            System.out.println("sum of all numbers :" + sum);
        }

    }
}
