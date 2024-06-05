import java.util.Scanner;
public class input {
    public static void main(String[] args){
        System.out.println("Enter.");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();//for single token
        String full_name=sc.nextLine();//for whole line
        int a=sc.nextInt();//for integer
        float b=sc.nextFloat();//for float value
        double d=sc.nextDouble();//for double value
        System.out.println(name);

    }
    
}
