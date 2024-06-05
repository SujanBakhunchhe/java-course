
class Calculator{

    public void add(int num1, int num2){
        System.out.println(num1+num2);
    }
}
public class ClassAndObjects {
    
    public static void main(String[] args){
        
            Calculator obj = new Calculator();
            obj.add(1,2);    
    }
}
