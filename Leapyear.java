import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Find the leap year of the given year");
        Scanner in =new Scanner(System.in);
        int year = in.nextInt();
        System.out.println(isLeapYear(year));
        in.close();
    }

    public static boolean isLeapYear(int year) {
        if((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)){
            return true;
        }
        return false;
    }
}
