interface Father{
     void   showAge(int i );
  
}

public class LambdaExpression {
    public static void main(String[] args){
      Father obj = (int i)->System.out.println("In Son class");
      //OR
      //Father obj = (i)->System.out.println("In Son class");
      //Father obj = i->System.out.println("In Son class");
      obj.showAge(8); 
    }

    
}
