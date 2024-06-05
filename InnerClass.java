class A{
    int age;

    public void showA(){
        System.out.println("In show A");
    }
    
    class B{ //static class B {
        public void showB(){
            System.out.println("In show B");
        }
    }
}


public class InnerClass {
    public static void main(String[] args){
        A obj1 = new A();
        obj1.showA();
        A.B obj2 = obj1.new B();//we dont have to use obj of class A if we use static keyword 
        obj2.showB();           // A.B obj2 = new A.B();
        
    }
}
