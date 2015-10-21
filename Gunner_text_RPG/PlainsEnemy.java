import java.util.*;
public class PlainsEnemy extends Enemy
{//
    /**
     * Default Constructor for the PlainsEnemy Class
     * Sets currentHealth = healthStat
     * "    currentMana = manaStat;
     */
    public PlainsEnemy()
    {//
        myCombatLevel = 1;
        attackStat = 17;
        mAttackStat = 17;
        defenceStat = 15;
        mDefenceStat = 15;
        healthStat = 30;
        manaStat = 25;
        speedStat = 13;
        currentHealth=30;
        currentMana=25;
        heal();
        myName=("Plains Enemy");
    }//
    /**
     * Returns the name given to the current PlainsEnemy
     * Returns the String myName of the PlainsEnemy
     * @Pre: none
     * @Post: none
     * @Return: String myName
     * @Param: none
     */
    public String getName()
    {//
        return ("Plains Enemy");
    }//
    /**
     * Returns the String "Plains Enemy"
     * @Pre: none
     * @Post: none
     * @Return: String "Plains Enemy"
     * @Param: none
     */
    public String getRole()
    {
        return ("Plains Enemy");
    }


/**
     * Returns the value of the PlainsEnemy's current health
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
     * Sets the PlainsEnemy's current health at newVal
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
     * Returns the PlainsEnemy's current mana
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
     * Sets the PlainsEnemy's current mana to newVal
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
     * Returns the PlainsEnemy's current combat level
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
     * Sets the PlainsEnemy's current combat level
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
     * Returns a boolean depending on whether the PlainsEnemy's current health is >0
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
     * Uses calculations to determine how much damage the PlainsEnemy will do to an opponent, and then subtracts 
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
     * Returns the PlainsEnemy's physical damage output
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
     * Returns the PlainsEnemy's magic damage output
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
     * Returns the PlainsEnemy's defence incoming
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
     * Returns the PlainsEnemy's magic defence incoming
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
     * Returns the PlainsEnemy's speed 
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