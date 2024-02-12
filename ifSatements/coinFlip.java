import java.util.Scanner;
import java.util.Random;
class coinFlip
{
    public static void main (String args[])
    {
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num == 0)
        {
            System.out.print("heads");
        }
        else
        {
            System.out.print("tails");
        }

    }
}