import java.util.Scanner;
public class Calculator2{
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Enter the operation to perform(+,-,*,/)");
        char c = sc.next(".").charAt(0);

        switch (c) {
            case '+' -> Calculator.add(a,b);
            case '-' -> Calculator.substract(a,b);
            case '*' -> Calculator.multiply(a,b);
            case '/' -> Calculator.divide(a,b);
            default -> System.out.println("Invalid");
        }
    }
}
 class Calculator{
     static void add(int a,int b){
        int c=a+b;
       System.out.println("addition = "+ c); 
    }
    public static void substract(int a,int b){
        int c=a-b;
       System.out.println("Substraction = "+ c); 
    }
    public static void multiply(int a,int b){
       System.out.println("product = "+ a*b); 
    }
    public static void divide(int a,int b){
        if(b>0){
       System.out.println("division = "+ a/b);}
       else{
        System.out.println("Invalid");
       }
    }
}