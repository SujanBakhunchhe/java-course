import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a=obj1.nextInt();
        System.out.println("Enter number b:");
        int b=obj1.nextInt();
        int sum = a+b;
        System.out.println("The sum of Two numbers is = "+sum);
    }
}
