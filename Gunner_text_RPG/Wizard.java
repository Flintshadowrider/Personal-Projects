import java.util.*;
/**
 * The warrior class
 * 
 * @Gunner Stone
 * @RPG 1.0
 */
public class Wizard extends Class
{////starts the Wizard class
    Scanner in = new Scanner(System.in);

    String myName = "FlintShadowrider";

    int experience=0;
    int experienceToLevelUp=81;

    int myGold=0;

    int currentHealth;
    int currentMana;

    int myCombatLevel = 1;
    int nextLevel = myCombatLevel+1;
    int attackStat = 1;
    int mAttackStat = 5;
    int defenceStat = 5;
    int mDefenceStat = 5;
    int healthStat = 15;
    int manaStat = 5;
    int speedStat = 5;
    /**
     * Default Constructor for the Wizard Class
     * Sets currentHealth = healthStat
     * "    currentMana = manaStat;
     */
    public Wizard()
    {//starts Wizard constructor 
        currentHealth=healthStat;
        currentMana=manaStat;
    }//ends Wizard constructor
    /**
     * Constructor for the Wizard Class
     * @Param: String characterName
     */
    public Wizard(String characterName)
    {////starts Wizard constructor
        myName=characterName;
        currentHealth=healthStat;
        currentMana=manaStat;
    }//ends Wizard constructor
    /**
     * Clears the console screen by placing many println's
     * @Pre: none
     * @Post: Fills 30 lines of the command prompt with spaces
     * @Return: void
     * @Param: none
     */
    public void cs()
    {//starts cs() method
        int x = 0;
        while (x<30)
        {//starts while1
            System.out.println();
            x++;
        }//ends while1
    }//ends cs() method
    /**
     * Returns the String "Wizard"
     * @Pre: none
     * @Post: none
     * @Return: String "Wizard"
     * @Param: none
     */
    public String getRole()
    {//starts getRole() method
        return "Wizard";
    }//ends getRole() method

    /**
     * Returns the name given to the current wizard
     * Returns the String myName of the Wizard
     * @Pre: none
     * @Post: none
     * @Return: String myName
     * @Param: none
     */
    public String getName()
    {//starts getName() method
        return myName;
    }//ends getName() method

    /**
     * Lists the Wizard's current stats
     * @Pre: dont use cs() method before
     * @Post: Prints onto the console all of the Wizards Current Stats
     * @Return: void
     * @Param: none
     */
    public void listStats()
    {//starts listStats() method
        this.cs();
        System.out.println();
        System.out.println("The "+getRole()+" "+getName()+"'s stats are: ");
        System.out.println();
        System.out.println("Combat level: "+myCombatLevel);
        System.out.println();
        System.out.println("Attack: "+attackStat);
        System.out.println("M.Attack: "+mAttackStat);
        System.out.println("Defence: "+defenceStat);
        System.out.println("M.Defence: "+mDefenceStat);
        System.out.println();
        System.out.println("Max Health: "+healthStat);
        System.out.println("Max Mana: "+manaStat);
        System.out.println("Speed: "+speedStat);        
    }//ends listStats() method

    /**
     * Levels up and displays all of the Wizards skills
     * @Pre: Assume the stats are not already leveled up
     * @Post: clears the screen, heals self, and then prints and displays current stats, and new stats
     * @Return: void
     * @Param: none
     */
    public void levelUp()
    {//starts levelUp() method
        this.cs();
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("  You leveled up!");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        Random generator = new Random();
        System.out.println();
        //prints out formatted combat stat level up
        System.out.printf("%-20s","Combat Level: ");
        System.out.printf("%-12s",myCombatLevel+"(1) = ");
        myCombatLevel++;
        System.out.print(myCombatLevel+"\n");

        System.out.println();
        //formatted attack stat level up
        System.out.printf("%-20s","Attack Stat: ");
        int attackUp=generator.nextInt(3) + 1;
        System.out.printf("%-12s",attackStat+"("+attackUp+") = ");
        attackStat+=attackUp;
        System.out.println(attackStat);
        //formatted magic attack stat level up
        System.out.printf("%-20s","M.Attack Stat: ");
        int mAttackUp=generator.nextInt(7) + 1;
        System.out.printf("%-12s",mAttackStat+"("+mAttackUp+") = ");
        mAttackStat+=mAttackUp;
        System.out.println(mAttackStat);
        //formatted defense stat level up
        System.out.printf("%-20s","Defence Stat: ");
        int defenceUp=generator.nextInt(3) + 1;
        System.out.printf("%-12s",defenceStat+"("+defenceUp+") = ");
        defenceStat+=defenceUp;
        System.out.println(defenceStat);
        //formatted magic defense stat level up
        System.out.printf("%-20s","M.Defence Stat: ");
        int mDefenceUp=generator.nextInt(6) + 1;
        System.out.printf("%-12s",mDefenceStat+"("+mDefenceUp+") = ");
        mDefenceStat+=mDefenceUp;
        System.out.println(mDefenceStat);

        System.out.println();

        //formatted max health stat level up 
        System.out.printf("%-20s","Maximum Health : ");
        int healthUp=generator.nextInt(8) + 1;
        System.out.printf("%-12s",healthStat+"("+healthUp+") = ");
        healthStat+=healthUp;
        System.out.println(healthStat);
        //formatted max mana stat level up
        System.out.printf("%-20s","Maximum Mana : ");
        int manaUp=generator.nextInt(6) + 1;
        System.out.printf("%-12s",manaStat+"("+manaUp+") = ");
        manaStat+=manaUp;
        System.out.println(manaStat);
        //formatted speed stat level up
        System.out.printf("%-20s","Speed Stat : ");
        int speedUp=generator.nextInt(5) + 1;
        System.out.printf("%-12s",speedStat+"("+speedUp+") = ");
        speedStat+=speedUp;
        System.out.println(speedStat);

        this.heal();
        System.out.println();
        System.out.println("**Your health and mana have been restored");
        System.out.println();
        System.out.printf("Press the Return key to continue");
        in.nextLine();

        return; 
    }//ends levelUp() method

    /**
     * Restores the Wizard's health and mana to full
     * @Pre: healthStat and manaStat >0;
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void heal()
    {//starts heal() method
        currentHealth=healthStat;
        currentMana=manaStat;
    }//ends heal() method

    /**
     * Returns the value of the Wizard's current health
     * @Pre: none
     * @Post: none
     * @Return: returns int currentHealth 
     * @Param: none
     */
    public int getCurrentHealth()
    {//starts getCurrentHealth() method
        return currentHealth;
    }//ends getCurrentHealth() method

    /**
     * Sets the Wizards current health at newVal
     * @Pre: Cannot set health <0
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentHealth(int newVal)
    {//starts setCurrentHealth(int newVal) method
        currentHealth = newVal;
    }//ends setCurrentHealth(int newVal) method

    /**
     * Returns the Wizards current mana
     * @Pre: none
     * @Post: none
     * @Return: int currentMana
     * @Param: none
     */
    public int getCurrentMana()
    {//starts getCurrentMana()
        return currentMana;
    }//ends getCurrentMana()

    /**
     * Sets the Wizard's current mana to newVal
     * @Pre: Cant set currentMana (<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentMana(int newVal)
    {//starts setCurrentMana(int newVal)
        currentMana = newVal;
    }//ends setCurrentMana(int newVal)

    /**
     * Returns the Wizard's current combat level
     * @Pre: none
     * @Post: none
     * @Return: int myCombatLevel
     * @Param: none
     */
    public int getCurrentLevel()
    {//starts getCurrentLevel()
        return myCombatLevel;
    }//ends getCurrentLevel()

    /**
     * Sets the Wizard's current combat level
     * @Pre: cannot setCurrentLevel(<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentLevel(int newVal)
    {//starts setCurrentLevel(int newVal)
        myCombatLevel = newVal;
    }//ends setCurrentLevel(int newVal)

    /**
     * Returns the Wizard's current Experience
     * @Pre: none
     * @Post: none
     * @Return: int experience
     * @Param: none
     */
    public int getCurrentExperience()
    {//
        return experience;
    }//

    /**
     * Sets the Wizard's current experience at newVal, will check for a level up
     * @Pre: Cannot setCurrentExperience(<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentExperience(int newVal)
    {//starts setCurrentExperience(int newVal)
        experience = newVal;
        if(experience>=experienceToLevelUp)
        {//starts if1
            this.levelUp();
            nextLevel++;
            double points = 0;
            double output = 0;
            int minlevel = 2; // first level to display
            int maxlevel = nextLevel; // last level to display

            for (int lvl = 1; lvl <= maxlevel; lvl++)
            {//starts for1
                points += Math.floor(lvl + 300 * Math.pow(2, lvl / 7.));

                output = Math.floor(points / 4);
            }//ends for1
            System.out.println("You need "+output+" total experience to level up");
            experienceToLevelUp=(int)output;
        }//ends if1
    }//ends setCurrentExperience(int newVal)

    /**
     * Returns the Wizard's current gold
     * @Pre: none
     * @Post: none
     * @Return: int myGold
     * @Param: none
     */
    public int getCurrentGold()
    {//starts getCurrentGold()
        return myGold;
    }//ends getCurrentGold()

    /**
     * Sets the Wizard's current gold at newVal
     * @Pre: newVal<0
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentGold(int newVal)
    {//starts setCurrentGold(int newVal)
        myGold=newVal;
    }//ends setCurrentGold(int newVal)

    /**
     * Returns a boolean depending on whether the Wizard's current health is >0
     * @Pre: none
     * @Post: none
     * @Return: boolean
     * @Param: none
     */
    public boolean isDead()
    {//starts isDead()
        if(currentHealth<=0)
        {//starts if1
            return true;
        }//ends if1
        else
        {//starts else1
            return false;
        }//ends else1
    }//ends isDead()

    /**
     * Uses calculations to determine how much damage the Wizard will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Enemy opponent
     */
    public void attack(Enemy opponent)
    {//starts attack(Enemy opponent)
        if(this.isDead()==false)
        {//starts if1
            System.out.println("You have attacked "+opponent.getName()+" for "+ ((this.getMDamage()-opponent.getMResist())+1)+" magic damage");
            opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getMDamage()-opponent.getMResist()+1));
            if(opponent.getCurrentHealth()>=0)
            {//starts if2
                System.out.println("Your opponent has "+opponent.getCurrentHealth()+" health remaining");
            }//ends if2
            else
            {//starts else1
                System.out.println("Your opponent has 0 health remaining");
            }//ends else1
            in.nextLine();
            return; 
        }////ends if1
        else
        {//starts else1
            this.die();
            in.nextLine();
            return; 
        }//ends else1
    }//ends attack(Enemy opponent)

    /**
     * 
     * Uses calculations to determine how much damage the Wizard will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Warrior opponent
     */
    public void attack(Warrior opponent)
    {//starts attack(Warrior opponent)
        if(this.isDead()==false)
        {//starts if1
            System.out.println("You have attacked "+opponent.getName()+" for "+ (this.getMDamage()-opponent.getMResist())+" magic damage");
            opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getMDamage()-opponent.getMResist()));
            in.nextLine();
            return; 
        }//ends if1
        else
        {//starts else1
            this.die();
            in.nextLine();
            return; 
        }//ends else1
    }//ends attack(Warrior opponent)

    /**
     * 
     * Uses calculations to determine how much damage the Wizard will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Wizard opponent
     */
    public void attack(Wizard opponent)
    {//
        if(this.isDead()==false)
        {//
            System.out.println("You have attacked "+opponent.getName()+" for "+ (this.getMDamage()-opponent.getMResist())+" magic damage");
            opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getMDamage()-opponent.getMResist()));
            in.nextLine();
            return; 
        }//
        else{//
            this.die();
            in.nextLine();
            return; 
        }//
    }//

    /**
     * Returns the Wizard's physical damage output
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
     * Returns the Wizard's magic damage output
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
     * Returns the Wizards defence incoming
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
     * Returns the Wizards magic defence incoming
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
     * Returns the Wizard's speed 
     * @Pre: none
     * @Post: none
     * @Return: ((int)speedStat)
     * @Param: none
     */
    public int getSpeed()
    {//
        return ((int)speedStat);
    }//

    /**
     * An output called when the Wizard's health <=0
     * @Pre: can only be called if currentHealth <=0
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void die()
    {//
        System.out.println("You have died");
    }//

    //bugged
    //     public void classUpgrade()
    //     {//
    //         this.cs();
    //         if(this.getCurrentLevel()>=10)
    //         {//
    //             System.out.println("You are able to change into a subclass!");
    //             System.out.println("Please choose one of the following or type in anything else to cancel");
    //             String input = new String (in.next());
    //             if (input.equals("Paladin"))
    //             {//
    //                 System.out.println();
    //                 System.out.println("Congratulations, you are now a Paladin!");
    //                 Paladin run = new Paladin (this.getName());
    //                 
    //             }//
    //         }//
    //     }//
}////ends the Wizard class