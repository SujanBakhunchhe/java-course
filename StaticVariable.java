class Student{
    int id;
    String name;
    static String faculty;

    public void showDetails(){
        System.out.println(id+" "+name+" "+faculty);
    }

}
public class StaticVariable {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.id = 11;
        std1.name="sujan";
        Student.faculty="comp";
        
        Student std2 = new Student();
        std2.id = 12;
        std2.name = "bakhunchhe";
        std2.faculty = "elec";
        std1.showDetails();
        std2.showDetails();
    }
}
