import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+""+"="+(i*n));
        }
    }
}
