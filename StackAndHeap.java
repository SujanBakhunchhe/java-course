// In side JVM we have two memory. One is Stack memory and another is heap memory.
// Every Method has its own stack.
class Person{
    int age=3; //This is called instance variable.

    public int getAge(int id){ // Here, id is local variable.
        return age;
    }
}
public class StackAndHeap {
    public static void main(String[] args){
        //int data = 10;
        Person obj1 = new Person(); // The obj1 and obj2 is called reference variable.
        Person obj2 = new Person();// new Person() creates objects in heap memory. the object has two sections. One is for Stroing all the instance variable and another is for method
        int r1 = obj1.getAge(10);
        int r2 = obj2.getAge(20);
        obj1.age=11;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }
}
