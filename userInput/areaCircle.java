import java.util.Scanner;

class areaCircle
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        double num = scanner.nextDouble();

        double area = (3.14159*(num*num));
        System.out.println("the area of the circle is " + area + ".");
      
    }
}