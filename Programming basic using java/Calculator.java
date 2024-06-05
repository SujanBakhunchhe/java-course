import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        String ch = obj.next();
        //int result;
        switch(ch){
            case "+"->System.out.println(a+b);
                    
            case "-"->System.out.println(a-b);
            
            case "*"->System.out.println(a*b);
          
            case "/"->System.out.println(a/b);
            
            case "%"->System.out.println(a%b);
            
            default->System.out.println("Please input valid operator");
        }
    }
    
}
