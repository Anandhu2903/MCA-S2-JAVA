import java.util.Scanner;
class Complex
{
    double real,imag;
    Complex(double r,double i)
    {
        this.real=r;
        this.imag=i;
    }
    Complex add(Complex other)
    {
        return new Complex(real+other.real,imag+other.imag);

    }
    void display()
    {
        System.out.println(real+"+"+imag+"i");

    }
}
public class ComplexAddition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number :");
        Complex num1=new Complex(sc.nextDouble(),sc.nextDouble());
        System.out.print("Enter real and imaginary part of the next complex number :");
        Complex num2=new Complex(sc.nextDouble(),sc.nextDouble());
        System.out.print("Sum :");
        num1.add(num2).display();
        sc.close();
    }
}