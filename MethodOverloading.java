class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}

public class MethodOverloading {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 2);
        int r2 = obj.add(1,3,4);
        System.out.print(r1+"\n"+r2);
    }
    
}
