import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Rectangle Area:");
        Scanner in =new Scanner(System.in);
        float len = in.nextFloat();
        float hei = in.nextFloat();
        AreaOfRectangle(len,hei);
        in.close();
    }

    public static void AreaOfRectangle(float len, float hei) {
        float area = len * hei;
        System.out.println("area of rectangle is : "+area);
    }
}
