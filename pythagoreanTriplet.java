import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println("Pythogorean triplet problem");
        Scanner in = new Scanner(System.in);
        System.out.println("Provide any three number to test:");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();

        if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2))
        {
            System.out.print("Number are Pythagorean Triples");
        }
        else
        {
            System.out.print("Number are not Pythagorean Triples");
        }

    }


}
