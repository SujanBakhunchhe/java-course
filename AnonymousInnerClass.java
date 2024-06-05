class Student{
    public void name(){
        System.out.println("hi!");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){
        Student obj = new Student(){
            public void name(){
                System.out.println("hi extends");
            }
        };
        obj.name();
    }
}
