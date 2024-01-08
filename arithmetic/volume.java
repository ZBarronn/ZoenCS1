class volume
{
    public static void main (String args[])
    {
        double radius = 5;
        double height = 8;
        double square = (radius * radius);
        double pi = (3.14159);
        double num = ((pi* square) * height);
        double num2 = ((2 * pi) * radius);
        double surfaceArea = (num2 * (radius + height));

        System.out.print("the volume is " + num + " and the surface area is " + surfaceArea + ".");

    }
}