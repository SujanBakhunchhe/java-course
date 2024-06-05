class SujanException extends Exception{ 
    public SujanException(String n){
        super(n);
    }
}
public class HandlingException {
    public static void main (String[] args) throws ArithmeticException{
        int i=0;
        int j=0;

        try{
             j= 19/i;
            // throw new ArithmeticException();
            // throw new SujanException("hello");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("hello");
        }
    }
}
