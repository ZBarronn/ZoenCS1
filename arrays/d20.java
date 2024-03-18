import java.util.Random;

public class d20 
{
    public static void main(String[] args) 
    {
        int heroHP = 100;
        int monsterHP = 100;
        Random random = new Random();

        while (heroHP > 0 && monsterHP > 0) 
        {
            int heroDamage = random.nextInt(20) + 1;
            monsterHP -= heroDamage;
            System.out.println("Hero attacks, " + heroDamage + " damage hit! Monster HP: " + monsterHP);
            
            int monsterDamage = random.nextInt(20) + 1;
            heroHP -= monsterDamage;
            System.out.println("Monster attacks, " + monsterDamage + " damage hit! Hero HP: " + heroHP);
        }

        System.out.println(heroHP <= 0 ? "The monster defeats the hero!" : "The hero defeats the monster!");
    }
}
