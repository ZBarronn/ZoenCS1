class discount
{
    public static void main (String args[])
    {
        double price = 80.0;
        double discount = 50.0;
        double discountPrice = price / 100.0 * discount;
           System.out.print(price - discountPrice);
    }
}