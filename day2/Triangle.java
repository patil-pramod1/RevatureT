import java.util.Scanner;
class Triangle{
    public static void Area(double length,double Bredth){
        double area =(0.5)*length*Bredth;
        System.out.println("The area is "+area);
    }
    public static void perimeter(double a,double b,double c){
        double peri =a+b+c;
        System.out.println("The perimeter is "+peri);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side1");
        double side1=sc.nextDouble();
        System.out.println("Enter the side2");
        double side2=sc.nextDouble();
        System.out.println("Enter the side3");
        double side3=sc.nextDouble();
        Area(side1,side2);
        perimeter(side1,side2,side3);
        
    }
}