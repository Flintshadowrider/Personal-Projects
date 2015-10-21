import java.util.*;
/**
 * An Interface determining what its subclasses must know.
 * 
 * @Gunner Stone
 * @RGP 1.0
 */
public interface Role
{
    
    public String getRole();
    public String getName();
    public boolean isDead();
    public int getCurrentHealth();
    public void setCurrentHealth(int newVal);
    public int getCurrentMana();
    public void setCurrentMana(int newVal);
    public int getCurrentLevel();
    public void setCurrentLevel(int newVal);
    public int getCurrentGold();
    public void setCurrentGold(int newVal);
    public int getCurrentExperience();
    public void setCurrentExperience(int newVal);
    public void heal();
    public int  getDamage();
    public int getMDamage();
    public int getResist();
    public int getMResist();
    public int getSpeed();
    public void attack(Warrior opponent);
    public void attack(Wizard opponent);
    public void attack(Enemy opponent);
    public void die();
    
}