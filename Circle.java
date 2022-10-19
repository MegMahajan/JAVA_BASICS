import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Find the circumference of the circle and area of the circle");
        System.out.println("Please provide radius value :");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        circleTotal(radius);
    }

    public static void circleTotal(double radius) {
        double area = Math.PI * (radius * radius);
        System.out.println("Area of the circle is :" + area);
        double circumference = 2 * Math.PI * radius;
        System.out.println("circumference of the circle is : " + circumference);
    }

}
