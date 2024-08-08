//Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
class Program3{
    public  static double func(int a){
        double b =( ((a+8)/3)%5)*5;
        return b;
    }
    public static void main(String[] args) {
        int a=2345;
        System.out.println(func(a));
    }
}