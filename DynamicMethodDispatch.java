class A1{
    public void show(){
        System.out.println("In show A");
    }
}
class B1 extends A1{
    public void show(){
        System.out.println("In show B");
    }
}
class C1 extends A1{
    public void show(){
        System.out.println("In show C");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
        A1 obj = new A1();
        obj.show();
        
        obj = new B1();
        obj.show();

        obj = new C1();
        obj.show();



    }

}
