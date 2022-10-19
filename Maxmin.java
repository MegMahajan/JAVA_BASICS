import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to even odd finder program");
        System.out.println("Please enter the first number");
        int first = in.nextInt();
        System.out.println("Please enter the sec number");
        int sec = in.nextInt();
        System.out.println("Please enter the third number");
        int third = in.nextInt();

        int largest = largest(first,sec,third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, sec, third, largest);

        int smallest = smallest(first,sec,third);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, sec, third, smallest);

        in.close();
    }

    public static int smallest(int first, int sec, int third) {
        int min =first;
        if(sec < min){
            min =sec;
        }

        if(third < min){
            min = third;
        }

        return min;
    }

    public static int largest(int first, int sec, int third) {
        int max =first;
        if(sec > max){
            max =sec;
        }

        if(third > max){
            max = third;
        }

        return max;
    }
}
