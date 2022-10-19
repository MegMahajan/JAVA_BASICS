import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Find out given number even or odd, Please enter a number");
        int n =in.nextInt();
        isEvenOrOdd(n);
        in.close();
    }

    public static void isEvenOrOdd(int n) {
        if(n % 2 == 0){
            System.out.println("This is even number");
        }else{
            System.out.println("This is odd number");
        }
    }


}
