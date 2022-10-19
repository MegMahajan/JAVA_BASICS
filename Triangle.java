import java.awt.geom.Area;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Triangle Area:");
        Scanner in = new Scanner(System.in);
        float h = in.nextFloat();
        System.out.println("height:"+h);
        float b = in.nextFloat();
        System.out.println("base:"+b);
        AreaOfTriangle(h, b);
        in.close();
    }

    public static void AreaOfTriangle(float h, float b) {
        float area = (h * b) / 2;
        System.out.println("Area of the triangle: " + area);
    }
}
