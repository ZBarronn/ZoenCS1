import java.util.Scanner;

class vowOrCon
{
    public static void main (String args[])
    {
        Scanner letterScanner = new Scanner(System.in);

        System.out.print("Please enter a single letter: ");
        String letter = letterScanner.nextLine();
        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
        {
            System.out.print("That is a vowel.");  
        }
        else
        {
          System.out.print("That is a consonant.");  
        }
        letterScanner.close();
    }
}