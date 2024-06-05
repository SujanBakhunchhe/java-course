//harek constructor ma super()method  hunxa jasle super class ko constructor lai call garxa
// this() method le chai affanai class ko constructor lai call garxa

class A extends Object{

    public A(){
        super();
        System.out.println("In default constructor of A");
    }
    public A(int n){
        super();
        System.out.println("In parameterized consturctor of A");
    }
 
}

class B extends A{
    public B(){
        super();
        System.out.println("In default consturctor of B");
    }
    public B(int n){
        this();
        System.out.println("In parameterized constructor of B");
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args){
        B obj = new B(5);
    }
}
