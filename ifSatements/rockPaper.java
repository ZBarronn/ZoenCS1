import java.util.Scanner;
import java.util.Random;

class rockPaper {
    public static void main(String args[]) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rock, Paper, or Scissors?: ");
        String choice = scanner.nextLine();
        System.out.print("Your choice: " + choice);

        Random rand = new Random();
        int num = rand.nextInt(2);


        if (num == 0) {
            System.out.println("  My choice: rock");
        }
        if (num == 1) {
            System.out.println("  My choice: paper");
        }
        if (num == 2) {
            System.out.println("  My choice: scissors");
        }


        if(num == 0 && choice.equals("rock"))
        {
            System.out.print("We tied!");  
        }
        else
        {
            if(num == 0 && choice.equals("paper"))
            {
                System.out.print("You won!");  
            }
            else
            {
                if(num == 0 && choice.equals("scissors"))
                {
                System.out.print("You lost!");  
                }
            }
        }


        if(num == 1 && choice.equals("paper"))
        {
            System.out.print("We tied!");  
        }
        else
        {
            if(num == 1 && choice.equals("scissors"))
            {
                System.out.print("You won!");  
            }
            else
            {
                if(num == 1 && choice.equals("rock"))
                {
                System.out.print("You lost!");  
                }
            }
        }


        if(num == 2 && choice.equals("scissors"))
        {
            System.out.print("We tied!");  
        }
        else
        {
            if(num == 2 && choice.equals("rock"))
            {
                System.out.print("You won!");  
            }
            else
            {
                if(num == 2 && choice.equals("paper"))
                {
                System.out.print("You lost!");  
                }
            }
        }
    }
}