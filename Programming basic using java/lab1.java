import java.util.Scanner;
public class lab1 {
    public static void main(String[] args){
        System.out.print("Choose one of the options:\n");
        System.out.println("1. Program to print hello world");
        System.out.println("2. Program to swap numbers");
        System.out.println("3. Largest of Three numbers");
        System.out.println("4. odd or even");
        System.out.println("5. The sum of n natural numbers");
        System.out.println("6. Leap year");
        System.out.println("7. factorial");
        System.out.println("8. Sum of numbers contained in array");
        System.out.println("9. prime number");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){

            case 1:

                System.out.println("Hello world!");

            break;

            case 2:
              
                System.out.println("Enter n1:");
                int n1= sc.nextInt();
                System.out.println("Enter n2:");
                int n2= sc.nextInt();
                int temp;
                temp = n1;
                n1 = n2;
                n2 = temp;
                System.out.println("n1:"+n1+" "+"n2"+n2);

            break;

            case 3:
                System.out.println("Enter 3 numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(a>b && a>c){
                    System.out.println(a+" is the greatest number");
                }
                else if(b>a && b>c){
                    System.out.println(b+" is the greatest number");
                }
                else{
                    System.out.println(c+" is the greatest number");
                }
            break;
            case 4:
                System.out.println("Enter the number:");
                int number = sc.nextInt();
                if(number%2==0){
                    System.out.println("The number is even");
                }
                else{
                    System.out.println("The number is odd");
                }
            break;
            case 5:
                System.out.println("Enter the term:");
                int term = sc.nextInt();
                int sum = 0;
                for(int i=1;i<=term;i++){
                    sum +=i;
                }
                System.out.println("The sum of natural numbers is"+ sum);
            break;
            case 6:
                System.out.println("Enter the year:");
                int year = sc.nextInt();
                if(year%4==0 && year%400==0 || year%100!=0){
                    System.out.println("The give year is leap year");
                }
                else
                {
                    System.out.println("The give year is not a leap year");
                }
            break;
            case 7:
                System.out.println("Enter the number");
                int fact=sc.nextInt();
                int result=1;
                for(int i =1;i<=fact;i++){
                    result*=i;
                }
                System.out.println(result);
            break;
            case 8:
            int[] array= new int[4];
            for(int i=0;i<=3;i++){
                array[i] = sc.nextInt();
            }
            for(int n: array){
                System.out.print(n);
            }
            break;
            case 9:
                System.out.println("Enter the number");
                int num =sc.nextInt();
                int count=0;
                for(int i=1;i<=num;i++){
                    if(num%i==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println("The number is prime");
                }
                else{
                    System.out.println("The number is not a prime");
                }
            break;
            default:
                System.out.println("Please choose vaild options.");
        }
        
    }
}
