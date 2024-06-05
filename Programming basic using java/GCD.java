import java.util.Scanner;
public class GCD {
    public static int Hcm(int a,int b){
        int Gcd=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                Gcd=i;
            }
        }
        return Gcd;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number a and b:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int result = Hcm(a,b);
        System.out.println(result);
    }
}
