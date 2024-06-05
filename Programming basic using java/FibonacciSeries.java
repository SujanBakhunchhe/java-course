import java.util.Scanner;
public class FibonacciSeries {
    static void fibonacciSeries(int n){
        int a=0;
        int b=1;
        int temp=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=n-2;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(b+" ");

        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = obj.nextInt();
        fibonacciSeries(n);
    }
}
