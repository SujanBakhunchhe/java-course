import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=obj.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    
}
