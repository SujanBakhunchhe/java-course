import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int age = obj.nextInt();
        if(age>18){
            System.out.println("Congratulations!");
        }
        else{
            System.out.println("Come back later");
        }
    }
   
}
