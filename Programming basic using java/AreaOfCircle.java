import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String arg[]){
        final double PI=3.14;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius of Circle:");
        double radius = obj.nextDouble();
        double Area = 2*PI*radius*radius;
        System.out.println("The area of circle is = "+Area);
    }
}
