//abstract method should be in abstrace class and we can't create the object of abstract class
//abstract class may or may not have abstract method.
abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("playing music");

    }
}
class Lambo extends Car{
    public void drive(){
        System.out.println("driving car");
    }
}
public class Abstract {
    public static void main(String[] args){
        Car obj = new Lambo();//can't create the object of abstract class but we can create a reference of abstract class
       
        obj.drive();
        obj.playMusic();
    }
    
}
