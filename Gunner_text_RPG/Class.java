
/**
 * Write a description of class Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Class implements Role
{
    /**
     * Restores the Class' health and mana to full
     * @Pre: healthStat and manaStat >0;
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void heal()
    {
        return;
    }
/**
     * Returns the Class's current gold
     * @Pre: none
     * @Post: none
     * @Return: int myGold
     * @Param: none
     */
    public int getCurrentGold()
    {
        return 9001;
    }
/**
     * Sets the Class's current gold at newVal
     * @Pre: newVal<0
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentGold(int newVal)
    {
        return;
    }
/**
     * Returns the String "Easter"
     * @Pre: none
     * @Post: none
     * @Return: String "Easter"
     * @Param: none
     */
    public String getRole()
    {
        return "Easter";
    }
/**
     * Returns the name given to the current Class
     * Returns the String myName of the Class
     * @Pre: none
     * @Post: none
     * @Return: String egg
     * @Param: none
     */
    public String getName()
    {
        return "Egg";
    }
/**
     * Returns a boolean depending on whether the Class's current health is >0
     * @Pre: none
     * @Post: none
     * @Return: boolean
     * @Param: none
     */
    public boolean isDead()
    {
        return true;
    }
/**
     * Returns the value of the Class's current health
     * @Pre: none
     * @Post: none
     * @Return: returns int 0 
     * @Param: none
     */
    public int getCurrentHealth()
    {
        return 0;
    }
/**
     * Sets the Class's current health at newVal
     * @Pre: Cannot set health <0
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentHealth(int newVal)
    {
        return;
    }
/**
     * Returns the Class's current mana
     * @Pre: none
     * @Post: none
     * @Return: int 0
     * @Param: none
     */
    public int getCurrentMana()
    {
        return 0;
    }
/**
     * Sets the Class's current mana to newVal
     * @Pre: Cant set currentMana (<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentMana(int newVal)
    {
        return;
    }
/**
     * Returns the Class's current combat level
     * @Pre: none
     * @Post: none
     * @Return: int myCombatLevel
     * @Param: none
     */
    public int getCurrentLevel()
    {
        return 0;
    }
/**
     * Sets the Class's current combat level
     * @Pre: cannot setCurrentLevel(<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentLevel(int newVal)
    {
        return;
    }
 /**
     * Returns the Class's current Experience
     * @Pre: none
     * @Post: none
     * @Return: int experience
     * @Param: none
     */
    public int getCurrentExperience()
    {
        return 0;
    }
/**
     * Sets the Class's current experience at newVal, will check for a level up
     * @Pre: Cannot setCurrentExperience(<0)
     * @Post: none
     * @Return: void
     * @Param: int newVal
     */
    public void setCurrentExperience(int newVal)
    {
        return;
    }
/**
     * Returns the Class's physical damage output
     * @Pre: none
     * @Post: none
     * @Return: int 0
     * @Param: none
     */
    public int  getDamage()
    {
        return 0;
    }
/**
     * Returns the Class's magic damage output
     * @Pre: none
     * @Post: none
     * @Return: int 0
     * @Param: none
     */
    public int getMDamage()
    {
        return 0;
    }
/**
     * Returns the Class' defence incoming
     * @Pre: none
     * @Post: none
     * @Return: int 0
     * @Param: none
     */
    public int getResist()
    {
        return 0;
    }
/**
     * Returns the Class' magic defence incoming
     * @Pre: none
     * @Post: none
     * @Return: int 0
     * @Param: none
     */
    public int getMResist()
    {
        return 0;
    }
/**
     * Returns the Class's speed 
     * @Pre: none
     * @Post: none
     * @Return:  int 0
     * @Param: none
     */
    public int getSpeed()
    {
        return (0);
    }
/**
     * Uses calculations to determine how much damage the Class will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Enemy opponent
     */
    public void attack(Enemy opponent)
    {
        return;
    }
/**
     * Uses calculations to determine how much damage the Class will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Wizard opponent
     */
    public void attack(Wizard opponent)
    {
        return;
    }
/**
     * Uses calculations to determine how much damage the Class will do to an opponent, and then subtracts 
     * that damage from the opponent's current health
     * @Pre: can only be called within the AdventureMenu class
     * @Post: none
     * @Return: void
     * @Param: Warrior opponent
     */
    public void attack(Warrior opponent)
    {
        return;
    }
/**
     * An output called when the Class's health <=0
     * @Pre: can only be called if currentHealth <=0
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void die()
    {
        return ;
    }
}
