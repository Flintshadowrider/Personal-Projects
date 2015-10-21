import java.util.*;
/**
 * Write a description of class AdventureMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdventureMenu
{//
    Role myCharacter;
    Scanner in = new Scanner(System.in);
    String choice = new String();
    ArrayList <Enemy> empty = new ArrayList();
    ArrayList <Enemy> enemies = new ArrayList();
    ArrayList <PlainsEnemy> emptyP = new ArrayList();
    ArrayList <PlainsEnemy> enemiesP = new ArrayList();
    boolean plainsUnlocked = false;
    /**
     * Constructor for AdventureMenu
     */
    public AdventureMenu()
    {//

    }//

    /**
     * Runs the menu for AdventureMenu
     * From Here the player can choose what location they wish to adventure in with their selected character
     * All experience and gold will be saved and returned back to Menu
     * @Pre: Must be called within Menu class
     * @Post: Role returned must be the save Role passed in
     * @Param: Role character
     * @Return: Role
     */
    public Role runAdventureMenu(Role character)
    {//
        myCharacter = character;
        cs();
        do
        {//
            System.out.println();
            System.out.println("Choose a location to adventure in");
            System.out.println("Please select an option");

            System.out.println();
            System.out.println("(1) Noobieland");
            System.out.println("(2) Plains");
            System.out.println("(3) NA");
            System.out.println("(4) NA");
            System.out.println("(5) NA");
            System.out.println("(6) NA");
            System.out.println("(7) NA");
            System.out.println("(Q) Quit");
            System.out.println();
            System.out.print("Choice ---> ");
            String input = new String (in.next());
            choice = input;
            if ('1' <= input.charAt(0) && input.charAt(0) <= '7')
            {//
                System.out.println();

                switch (input.charAt(0))
                {//
                    case '1':
                    runNoobieLand();
                    cs();
                    return myCharacter;
                    case '2':
                    if(plainsUnlocked==true)
                    {//
                        runPlains();
                        cs();
                        return myCharacter;
                    }//
                    else
                    {//
                        cs();
                        System.out.println("You have not unlocked the Plains yet");
                    }//
                    case '3':

                    break;
                    case '4':

                    break;
                    case '5':

                    break;
                    case '6':

                    break;
                    case '7':

                    break;

                }//
            }//
        } while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
        return myCharacter;
    }//

    /**
     * Runs the NoobieLand adventure of 10 enemies dropping 40 xp and 20 gold each
     * @Pre: Must be run within runAdventureMenu
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void runNoobieLand()
    {//
        for(int i = 0;i<10;i++)
        {//
            Enemy enemy = new Enemy();
            enemies.add(enemy);

        }//
        cs();
        for(int i = 0;i<enemies.size();i++)
        {//
            System.out.println("A random "+enemies.get(i).getName()+" has appeared");
            do
            {//
                System.out.println();
                System.out.println("Please select an option");

                System.out.println();
                System.out.println("(1) Attack");
                System.out.println("(2) NA");
                System.out.println("(3) NA");
                System.out.println("(4) NA");
                System.out.println("(5) NA");
                System.out.println("(6) NA");
                System.out.println("(7) Return to Tavern");
                System.out.println("(Q) flee");
                System.out.println();
                System.out.print("Choice ---> ");
                String input = new String (in.next());
                choice = input;
                if ('1' <= input.charAt(0) && input.charAt(0) <= '7')
                {//
                    System.out.println();

                    switch (input.charAt(0))
                    {//
                        case '1':
                        if(myCharacter.getSpeed()>=enemies.get(i).getSpeed())
                        {//
                            myCharacter.attack(enemies.get(i));
                            if(enemies.get(i).isDead()==true)
                            {//
                                enemies.get(i).die();
                                System.out.println("You have gained 40 experience!");

                                myCharacter.setCurrentExperience(myCharacter.getCurrentExperience()+40);
                                System.out.println("You have gained 20 gold!");

                                myCharacter.setCurrentGold(myCharacter.getCurrentGold()+20);
                                choice="Q";

                            }//
                            enemies.get(i).attack(myCharacter);

                            if(myCharacter.isDead()==true)
                            {//
                                cs();
                                myCharacter.die();
                                myCharacter.heal();
                                enemies=empty;
                                return;

                            }//

                        }//
                        else
                        {//
                            enemies.get(i).attack(myCharacter);

                            if(myCharacter.isDead()==true)
                            {//
                                cs();
                                myCharacter.die();
                                myCharacter.heal();
                                enemies=empty;
                                return;

                            }//
                            myCharacter.attack(enemies.get(i));
                            if(enemies.get(i).isDead()==true)
                            {//
                                enemies.get(i).die();
                                System.out.println("You have gained 40 experience!");

                                myCharacter.setCurrentExperience(myCharacter.getCurrentExperience()+40);
                                System.out.println("You have gained 20 gold!");

                                myCharacter.setCurrentGold(myCharacter.getCurrentGold()+20);
                                choice="Q";

                            }//
                        }//
                        break;
                        case '2':

                        break;
                        case '3':

                        break;
                        case '4':

                        break;
                        case '5':

                        break;
                        case '6':

                        break;
                        case '7':
                        myCharacter.heal();
                        enemies=empty;
                        return;

                    }//
                }//
            } while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');

        }//
        enemies=empty;
        plainsUnlocked=true;
    }//

    /**
     * Runs the Plains adventure
     * Here there are 10 enemies dropping 80xp and 30gold each
     * @Pre: Must be run within runAdventureMenu
     * @Post: none
     * @Return: void
     * @Param: none
     */
    public void runPlains()
    {//
        for(int i = 0;i<10;i++)
        {//
            PlainsEnemy enemy = new PlainsEnemy();
            enemiesP.add(enemy);

        }//
        cs();
        for(int i = 0;i<enemies.size()-1;i++)
        {//
            System.out.println("A random "+enemies.get(i).getName()+" has appeared");
            do
            {//
                System.out.println();
                System.out.println("Please select an option");

                System.out.println();
                System.out.println("(1) Attack");
                System.out.println("(2) NA");
                System.out.println("(3) NA");
                System.out.println("(4) NA");
                System.out.println("(5) NA");
                System.out.println("(6) NA");
                System.out.println("(7) Return to Tavern");
                System.out.println("(Q) flee");
                System.out.println();
                System.out.print("Choice ---> ");
                String input = new String (in.next());
                choice = input;
                if ('1' <= input.charAt(0) && input.charAt(0) <= '7')
                {//
                    System.out.println();

                    switch (input.charAt(0))
                    {//
                        case '1':
                        if(myCharacter.getSpeed()>=enemiesP.get(i).getSpeed())
                        {//
                            myCharacter.attack(enemiesP.get(i));
                            if(enemiesP.get(i).isDead()==true)
                            {//
                                enemiesP.get(i).die();
                                System.out.println("You have gained 80 experience!");

                                myCharacter.setCurrentExperience(myCharacter.getCurrentExperience()+80);
                                System.out.println("You have gained 30 gold!");

                                myCharacter.setCurrentGold(myCharacter.getCurrentGold()+30);
                                choice="Q";

                            }//
                            enemiesP.get(i).attack(myCharacter);

                            if(myCharacter.isDead()==true)
                            {//
                                cs();
                                myCharacter.die();
                                myCharacter.heal();
                                enemiesP=emptyP;
                                return;

                            }//
                        }//
                        else
                        {//
                            if(enemiesP.get(i).isDead()==true)
                            {//
                                enemiesP.get(i).die();
                                System.out.println("You have gained 30 experience!");

                                myCharacter.setCurrentExperience(myCharacter.getCurrentExperience()+80);
                                System.out.println("You have gained 30 gold!");

                                myCharacter.setCurrentGold(myCharacter.getCurrentGold()+30);
                                choice="Q";

                            }//
                            enemiesP.get(i).attack(myCharacter);

                            if(myCharacter.isDead()==true)
                            {//
                                cs();
                                myCharacter.die();
                                myCharacter.heal();
                                enemiesP=emptyP;
                                return;

                            }//
                            myCharacter.attack(enemiesP.get(i));

                        }//
                        break;
                        case '2':

                        break;
                        case '3':

                        break;
                        case '4':

                        break;
                        case '5':

                        break;
                        case '6':

                        break;
                        case '7':
                        myCharacter.heal();
                        enemiesP=emptyP;
                        return;

                    }//
                }//
            } while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');

        }//
        enemiesP=emptyP;

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
}//
