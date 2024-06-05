interface X1{
    int age = 23;
    String name = "sujan";//by default instance variable in interface  final and static(call by class name)
     void design();// by default the method are public abstract
     void design1();
}
class X2 implements X1{
    public void design(){
        System.out.println("detailed  design");
    }
    public void design1(){
        System.out.println("detailed desing 1");
    }
    
}
public class Interface {
    public static void main(String[] args){
        X1 obj1 = new X2();
        obj1.design();
        obj1.design1();
    }
}
