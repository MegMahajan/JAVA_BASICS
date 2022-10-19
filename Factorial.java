import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial Series");
        Scanner in = new Scanner(System.in);
        int fact = 1;
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            fact = fact * i;
          }
        System.out.println(" factorial of fact is : "+fact);

    }
}
