//Every time we create objects, two things happens. First it loads the class and instantiated objects.
//Class is only loaded once.
//if we dont create the object it wont call constructor and static block.
//so inorder to load class without creating objects.we use Class.forName("class name");
class Student{
    int id;
    String name;
    static String faculty;
    static{
        faculty = "comp";
    }
    public void show1(){
        System.out.println(id+" "+name+" "+faculty);
    }
    public static void show2(Student std2){
        System.out.println(std2.id+" "+std2.name+" "+faculty);
    }

}
public class StaticBlock {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.id = 11;
        std1.name="sujan";
    
        
        Student std2 = new Student();
        std2.id = 12;
        std2.name = "bakhunchhe";
    
        std1.show1();
        Student.show2(std2);
    }
}
