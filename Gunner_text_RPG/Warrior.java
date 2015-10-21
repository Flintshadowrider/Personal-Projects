import java.util.*;
/**
 * The warrior class
 * 
 * @Gunner Stone
 * @RPG 1.0
 */
public class Warrior extends Class
{//
    Scanner in = new Scanner(System.in);

    String myName = "FlintShadowrider";

    int experience=0;
    int experienceToLevelUp=81;

    int currentHealth;
    int currentMana;

    int myGold =0;

    int myCombatLevel = 1;
    int nextLevel = myCombatLevel+1;

    int attackStat = 5;
    int mAttackStat = 1;
    int defenceStat = 5;
    int mDefenceStat = 5;
    int healthStat = 15;
    int manaStat = 5;
    int speedStat = 5;
    /**
     * Default Constructor for the Warrior Class
     * Sets currentHealth = healthStat
     * "    currentMana = manaStat;
     */
    public Warrior()
    {//
        currentHealth=healthStat;
        currentMana=manaStat;
    }//
    /**
     * Constructor for the Warrior Class
     * @Param: String characterName
     */
    public Warrior(String characterName)
    {//
        myName=characterName;
        currentHealth=healthStat;
        currentMana=manaStat;
    }//
    /**
     * Clears the console screen by placing many println's
     * @Pre: none
     * @Post: Fills 30 lines of the command prompt with spaces
     * @Return: void
     * @Param: none
     */
    public void cs()
    {//
        int x = 0;
        while (x<30)
        {//
            System.out.println();
            x++;
        }//
    }//
    /**
     * Returns the String "Warrior"
     * @Pre: none
     * @Post: none
     * @Return: String "Warrior"
     * @Param: none
     */
    public String getRole()
    {//
        return "Warrior";
    }//
    /**
     * Returns the name given to the current Warrior
     * Returns the String myName of the Warrior
     * @Pre: none
     * @Post: none
     * @Return: String myName
     * @Param: none
     */
    public String getName()
    {//
        return myName;
    }//
    /**
     * Lists the Warrior's current stats
     * @Pre: dont use cs() method before
     * @Post: Prints onto the console all of the Wizards Current Stats
     * @Return: void
     * @Param: none
     */
    public void listStats()
    {//
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
    }//
    /**
     * Levels up and displays all of the Warrior's skills
     * @Pre: Assume the stats are not already leveled up
     * @Post: clears the screen, heals self, and then prints and displays current stats, and new stats
     * @Return: void
     * @Param: none
     */
    public void levelUp()
    {//
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
        int attackUp=generator.nextInt(5) + 1;
        System.out.printf("%-12s",attackStat+"("+attackUp+") = ");
        attackStat+=attackUp;
        System.out.println(attackStat);
        //formatted magic attack stat level up
        System.out.printf("%-20s","M.Attack Stat: ");
        int mAttackUp=generator.nextInt(3) + 1;
        System.out.printf("%-12s",mAttackStat+"("+mAttackUp+") = ");
        mAttackStat+=mAttackUp;
        System.out.println(mAttackStat);
        //formatted defense stat level up
        System.out.printf("%-20s","Defence Stat: ");
        int defenceUp=generator.nextInt(5) + 1;
        System.out.printf("%-12s",defenceStat+"("+defenceUp+") = ");
        defenceStat+=defenceUp;
        System.out.println(defenceStat);
        //formatted magic defense stat level up
        System.out.printf("%-20s","M.Defence Stat: ");
        int mDefenceUp=generator.nextInt(5) + 1;
        System.out.printf("%-12s",mDefenceStat+"("+mDefenceUp+") = ");
        mDefenceStat+=mDefenceUp;
        System.out.println(mDefenceStat);

        System.out.println();

        //formatted max health stat level up 
        System.out.printf("%-20s","Maximum Health : ");
        int healthUp=generator.nextInt(9) + 1;
        System.out.printf("%-12s",healthStat+"("+healthUp+") = ");
        healthStat+=healthUp;
        System.out.println(healthStat);
        //formatted max mana stat level up
        System.out.printf("%-20s","Maximum Mana : ");
        int manaUp=generator.nextInt(3) + 1;
        System.out.printf("%-12s",manaStat+"("+manaUp+") = ");
        manaStat+=manaUp;
        System.out.println(manaStat);
        //formatted speed stat level up
        System.out.printf("%-20s","Speed Stat : ");
        int speedUp=generator.nextInt(4) + 1;
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
    }//
    /**
     * Restores the Warrior's health and mana to full
     * @Pre: healthStat and manaStat >0;
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void heal()
    {//
        currentHealth=healthStat;
        currentMana=manaStat;
    }//
    /**
     * Returns the value of the Warrior's current health
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
     * Sets the Warrior's current health at newVal
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
     * Returns the Warrior's current mana
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
     * Sets the Warrior's current mana to newVal
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
     * Returns the Warrior's current combat level
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
     * Sets the Warrior's current combat level
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
     * Returns the Warrior's current Experience
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
     * Sets the Warrior's current experience at newVal, will check for a level up
     * @Pre: Cannot setCurrentExperience(<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentExperience(int newVal)
    {//
        experience = newVal;
        if(experience>=experienceToLevelUp)
        {//
            this.levelUp();
            nextLevel++;
            double points = 0;
            double output = 0;
            int minlevel = 2; // first level to display
            int maxlevel = nextLevel; // last level to display

            for (int lvl = 1; lvl <= maxlevel; lvl++)
            {//
                points += Math.floor(lvl + 300 * Math.pow(2, lvl / 7.));

                output = Math.floor(points / 4);
            }//
            System.out.println("You need "+output+" total experience to level up");
            experienceToLevelUp=(int)output;
        }//
    }//
    /**
     * Returns the Warrior's current gold
     * @Pre: none
     * @Post: none
     * @Return: int myGold
     * @Param: none
     */
    public int getCurrentGold()
    {//
        return myGold;
    }//
    /**
     * Sets the Warrior's current gold at newVal
     * @Pre: newVal<0
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentGold(int newVal)
    {//
        myGold=newVal;
    }//
    /**
     * Returns a boolean depending on whether the Warrior's current health is >0
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
     * Uses calculations to determine how much damage the Warrior will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Warrior opponent
     */
    public void attack(Warrior opponent)
    {//
        if(this.isDead()==false)
        {//
            System.out.println("You have attacked "+opponent.getName()+" for "+ (this.getDamage()-opponent.getResist())+" physical damage");
            opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getDamage()-opponent.getResist()));
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
     * Uses calculations to determine how much damage the Warrior will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Enemy opponent
     */
    public void attack(Enemy opponent)
    {//
        if(this.isDead()==false)
        {//
            if(((this.getDamage()-opponent.getResist())+1)>0)
            {//
                System.out.println("You have attacked "+opponent.getName()+" for "+ ((this.getDamage()-opponent.getResist())+1)+" physical damage");
                opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getDamage()-opponent.getResist()+1));
                if(opponent.getCurrentHealth()>=0)
                {//
                    System.out.println("Your opponent has "+opponent.getCurrentHealth()+" health remaining");
                }//
                else
                {//
                    System.out.println("Your opponent has 0 health remaining");
                }//
                in.nextLine();
                return; 
            }//
            else
            {//
                System.out.println("You have attacked "+opponent.getName()+" for "+ 1+" physical damage");
                opponent.setCurrentHealth(opponent.getCurrentHealth()-1);
                System.out.println("Your opponent has "+opponent.getCurrentHealth()+" health remaining");
                in.nextLine();
                return; 
            }//
        }//
        else{//
            this.die();
            in.nextLine();
            return; 
        }//
    }//
    /**
     * Uses calculations to determine how much damage the Warrior will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: PlainsEnemy opponent
     */
    public void attack(PlainsEnemy opponent)
    {//
        if(this.isDead()==false)
        {//
            if(((this.getDamage()-opponent.getResist())+1)>0)
            {//
                System.out.println("You have attacked "+opponent.getName()+" for "+ ((this.getDamage()-opponent.getResist())+1)+" physical damage");
                opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getDamage()-opponent.getResist()+1));
                if(opponent.getCurrentHealth()>=0)
                {//
                    System.out.println("Your opponent has "+opponent.getCurrentHealth()+" health remaining");
                }//
                else
                {//
                    System.out.println("Your opponent has 0 health remaining");
                }//
                in.nextLine();
                return; 
            }//
            else
            {//
                System.out.println("You have attacked "+opponent.getName()+" for "+ 1+" physical damage");
                opponent.setCurrentHealth(opponent.getCurrentHealth()-1);
                System.out.println("Your opponent has "+opponent.getCurrentHealth()+" health remaining");
                in.nextLine();
                return; 
            }//
        }//
        else{//
            this.die();
            in.nextLine();
            return; 
        }//
    }//
    /**
     * Uses calculations to determine how much damage the Warrior will do to an opponent, and then subtracts 
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
            System.out.println("You have attacked "+opponent.getName()+" for "+ (this.getDamage()-opponent.getResist())+" magic damage");
            opponent.setCurrentHealth(opponent.getCurrentHealth()-(this.getDamage()-opponent.getResist()));
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
     * Returns the Warrior's physical damage output
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
     * Returns the Warrior's magic damage output
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
     * Returns the Warrior's defence incoming
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
     * Returns the Warrior's magic defence incoming
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
     * Returns the Warrior's speed 
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
     * An output called when the Warrior's health <=0
     * @Pre: can only be called if currentHealth <=0
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void die()
    {//
        System.out.println("You have died");
    }//

    //     //bugged
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
}//