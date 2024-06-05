class Student{
    int id;
    String name;
    static String faculty;

    public void show1(){
        System.out.println(id+" "+name+" "+faculty);
    }
    public static void show2(Student std2){
        System.out.println(std2.id+" "+std2.name+" "+faculty);
    }

}
public class StaticMethod {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.id = 11;
        std1.name="sujan";
        Student.faculty="comp";
        
        Student std2 = new Student();
        std2.id = 12;
        std2.name = "bakhunchhe";
        Student.faculty = "elec";
        std1.show1();
        Student.show2(std2);
    }
}
