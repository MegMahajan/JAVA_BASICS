import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Inr to usd conversion");
        Scanner in = new Scanner(System.in);
        float rup = in.nextLong();
        float dollar = rup / 64;
        System.out.println("So rupees in dollar in:" + dollar);


    }
}
