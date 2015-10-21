import java.util.*;
/**
 * The warrior class
 * 
 * @Gunner Stone
 * @RPG 1.0
 */
public class Enemy extends Warrior
{//
    Scanner in = new Scanner(System.in);

    String myName = "Enemy";

    int experience=0;

    int myGold=0;

    int currentHealth=15;
    int currentMana=5;

    int myCombatLevel = 1;
    int attackStat = 1;
    int mAttackStat = 5;
    int defenceStat = 2;
    int mDefenceStat = 2;
    int healthStat = 15;
    int manaStat = 5;
    int speedStat = 4;
    /**
     * Default Constructor for the Enemy Class
     * Sets currentHealth = healthStat
     * "    currentMana = manaStat;
     */
    public Enemy()
    {//
        currentHealth=healthStat;
        currentMana=manaStat;
    }//

    /**
     * Constructor for the Enemy Class
     * @Param: String characterName
     */
    public Enemy(String characterName)
    {//
        myName=characterName;
        currentHealth=healthStat;
        currentMana=manaStat;
    }//

    /**
     * Returns the String "Enemy"
     * @Pre: none
     * @Post: none
     * @Return: String "Enemy"
     * @Param: none
     */
    public String getRole()
    {//
        return "Enemy";
    }//

    /**
     * Returns the name given to the current Enemy
     * Returns the String myName of the Enemy
     * @Pre: none
     * @Post: none
     * @Return: String myName
     * @Param: none
     */
    public String getName()
    {//
        return "Enemy";
    }//

    /**
     * Levels up and displays all of the Enemy's skills
     * @Pre: Assume the stats are not already leveled up
     * @Post: clears the screen, heals self, and then prints and displays current stats, and new stats
     * @Return: void
     * @Param: none
     */
    public void levelUp()
    {//

        Random generator = new Random();
        //prints out formatted combat stat level up

        myCombatLevel++;

        //formatted attack stat level up
        int attackUp=generator.nextInt(5) + 1;
        attackStat+=attackUp;
        //formatted magic attack stat level up
        int mAttackUp=generator.nextInt(3) + 1;
        mAttackStat+=mAttackUp;
        //formatted defense stat level up
        int defenceUp=generator.nextInt(5) + 1;
        defenceStat+=defenceUp;
        //formatted magic defense stat level up
        int mDefenceUp=generator.nextInt(5) + 1;
        mDefenceStat+=mDefenceUp;

        //formatted max health stat level up 
        int healthUp=generator.nextInt(9) + 1;
        healthStat+=healthUp;
        //formatted max mana stat level up
        int manaUp=generator.nextInt(3) + 1;
        manaStat+=manaUp;
        //formatted speed stat level up

        int speedUp=generator.nextInt(4) + 1;

        speedStat+=speedUp;

        this.heal();
        return; 
    }//

    /**
     * Returns the value of the Enemy's current health
     * @Pre: none
     * @Post: none
     * @Return: returns int currentHealth 
     * @Param: none
     */
    public int getCurrentHealth()
    {//
        return currentHealth;
    }//

    /**
     * Sets the Enemy's current health at newVal
     * @Pre: Cannot set health <0
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentHealth(int newVal)
    {//
        currentHealth = newVal;
    }//

    /**
     * Returns the Enemy's current mana
     * @Pre: none
     * @Post: none
     * @Return: int currentMana
     * @Param: none
     */
    public int getCurrentMana()
    {//
        return currentMana;
    }//

    /**
     * Sets the Enemy's current mana to newVal
     * @Pre: Cant set currentMana (<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentMana(int newVal)
    {//
        currentMana = newVal;
    }//

    /**
     * Returns the Enemy's current combat level
     * @Pre: none
     * @Post: none
     * @Return: int myCombatLevel
     * @Param: none
     */
    public int getCurrentLevel()
    {//
        return myCombatLevel;
    }//

    /**
     * Sets the Enemy's current combat level
     * @Pre: cannot setCurrentLevel(<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentLevel(int newVal)
    {//
        myCombatLevel = newVal;
    }//

    /**
     * Returns a boolean depending on whether the Enemy's current health is >0
     * @Pre: none
     * @Post: none
     * @Return: boolean
     * @Param: none
     */
    public boolean isDead()
    {//
        if(currentHealth<=0)
        {//
            return true;
        }//
        else
        {//
            return false;
        }//
    }//

    /**
     * Uses calculations to determine how much damage the Enemy will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Warrior opponent
     */
    public void attack(Role opponent)
    {//
        if(this.isDead()==false)
        {//
            if(((this.getDamage()-opponent.getResist())+3)>0)
            {//
                System.out.println("The enemy has attacked "+opponent.getName()+" for "+ ((this.getDamage()-opponent.getResist())+3)+" physical damage");

                opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getDamage()-opponent.getResist()+3));
                System.out.println("You have "+opponent.getCurrentHealth()+" health remaining");
                in.nextLine();
                return;
            }//
            else
            {//
                System.out.println("The enemy has attacked "+opponent.getName()+" for "+ 1+" physical damage");

                opponent.setCurrentHealth(opponent.getCurrentHealth()-1);
                System.out.println("You have "+opponent.getCurrentHealth()+" health remaining");
                in.nextLine();
                return;
            }//

        }//
        else{//
            in.nextLine();
            return; 
        }//
    }//

    /**
     * Returns the Enemy's physical damage output
     * @Pre: none
     * @Post: none
     * @Return: ((int)(attackStat/2))+1
     * @Param: none
     */
    public int getDamage()
    {//
        return ((int)(attackStat/2))+1;
    }//

    /**
     * Returns the Enemy's magic damage output
     * @Pre: none
     * @Post: none
     * @Return: ((int)(mAttackStat/2))+1
     * @Param: none
     */
    public int getMDamage()
    {//
        return ((int)(mAttackStat/2))+1;
    }//

    /**
     * Returns the Enemy's defence incoming
     * @Pre: none
     * @Post: none
     * @Return: ((int)(defenceStat/2))+1
     * @Param: none
     */
    public int getResist()
    {//
        return ((int)(defenceStat/2))+1;        
    }//

    /**
     * Returns the Enemy's magic defence incoming
     * @Pre: none
     * @Post: none
     * @Return: ((int)(mDefenceStat/2))+1
     * @Param: none
     */
    public int getMResist()
    {//
        return ((int)(mDefenceStat/2))+1;
    }//

    /**
     * An output called when the Enemy's health <=0
     * @Pre: can only be called if currentHealth <=0
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void die()
    {//
        System.out.println("The "+getRole()+" has died");
    }//

    /**
     * Returns the Enemy's speed 
     * @Pre: none
     * @Post: none
     * @Return: ((int)speedStat)
     * @Param: none
     */
    public int getSpeed()
    {//
        return ((int)speedStat);
    }//

}//