import java.util.Scanner;
public class Function {
    public static int functionSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = obj.nextInt();
        System.out.print("Enter the number b: ");
        int b= obj.nextInt();
        System.out.println(functionSum(a, b));
        


    }
}
