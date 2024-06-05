abstract class Apple{
    public abstract void showA();
    public abstract void showB();
}


public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args){
        Apple obj = new Apple()
            
       {
            public void showA(){
                System.out.println("In new  show a");
            }
            public void showB(){
                System.out.println("In new  show b");
            }
        };
        obj.showA();
        obj.showB();
    }
}
