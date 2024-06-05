import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
       int n;
       
        do{

            System.out.println("Enter the mask");
            int marks = obj.nextInt();
            if(marks>=90)
                System.out.println("This is good");
            else if(marks>=60 && marks<=89)
                System.out.println("This good as well");
            else{
                System.out.println("this is also good");
            }
            System.out.println("Enter 1 to continue and 0 to end");
            n = obj.nextInt();
        }while(n!=0);
    }
}
