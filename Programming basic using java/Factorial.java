import java.util.Scanner;
public class Factorial {

    public static int factorial(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int result = factorial(a);
        System.out.println(result);
    }
}
