@FunctionalInterface
interface A{
   // void show();//functioninterface annotation allows only one method in interface
    void showDetails();
}

public class FunctionInterface {
    public static void main(String[] args){
        A obj = new A() {
            public void showDetails(){
                System.out.println("In show B");
            }
        };
        obj.showDetails();
    }
}
