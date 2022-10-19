import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
            System.out.println("Find out that the number given is prime number or not.");
            Scanner in;
            in = new Scanner(System.in);
            int n = in.nextInt();
        for (int i = 2; i < n; i++){
            System.out.println("print number"+i);
        }
//            if(isPrime(n)){
//                System.out.println("This is prime number");
//            }else{
//                System.out.println("This is not prime number");
//            }
        }

    public static boolean isPrime(int n) {
        if (n == 1) {
           return false;
        }
       for (int i = 2; i < n; i++)
           if (n % i == 0)
               return false;
        return true;
    }

}


