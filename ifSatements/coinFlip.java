import java.util.Scanner;
import java.util.Random;
class coinFlip
{
    public static void main (String args[])
    {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if(n == 1)
        {
            System.out.print("heads");
        }
        else
        {
            System.out.print("tails");
        }

    }
}