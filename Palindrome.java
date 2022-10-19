import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Find the number is palindrome or not");
        Scanner in = new Scanner(System.in);
        int inp = in.nextInt();
        boolean p = checkPalindrome(inp);
        if(p) {
            System.out.println("This is Palindrome number ");
        }else{
            System.out.println("This is not Palindrome number");
        }

    }

    public static boolean checkPalindrome(int inp) {
        int rev = 0;
        int temp = inp;
        while (temp != 0){
            rev = (rev * 10) + (temp % 10);
            temp =temp/10 ;
        }
        return (rev == inp);
    }
}
