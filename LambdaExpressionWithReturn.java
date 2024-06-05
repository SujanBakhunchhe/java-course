//Lambda expression only works with functionalInterface
interface A{
    int add(int n1, int n2);
}
public class LambdaExpressionWithReturn {
    public static void main (String[] args){

        A obj = ( n1, n2)->  n1+n2;
         
        
        int result =obj.add(2,3);
       System.out.println(result); 
    }
}
