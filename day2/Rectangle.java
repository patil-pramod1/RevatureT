import java.util.Scanner;
class Rectangle{
    public static void Area(double length,double Bredth){
        double area = length*Bredth;
        System.out.println("The area is "+area);
    }
    public static void perimeter(double length,double Bredth){
        double peri =2*(length+Bredth);
        System.out.println("The perimeter is "+peri);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length");
        double length=sc.nextDouble();
        System.out.println("Enter the Bredth");
        double Bredth=sc.nextDouble();
        Area(length,Bredth);
        perimeter(length,Bredth);
        
    }
}