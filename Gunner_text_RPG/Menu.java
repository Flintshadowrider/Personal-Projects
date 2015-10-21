import java.util.*;
public class Menu
{//
    Scanner in = new Scanner(System.in);
    private ArrayList <Role> myArray;
    Role myCharacter = new Class();
    AdventureMenu advMenu = new AdventureMenu();

    int cchoice;

    private String listType;
    String choice = new String();

    int playerGold=100;
    /**
     *  Constructor for the SortStep object
     */
    public Menu()
    {//

        myArray = new ArrayList<Role>();
        listType = "Integer";
    }//

    /**
     *  Asks the user to select an option within the pub
     *  @Pre: Run this once to start the program
     *  @Post: Never Run this again
     *  @Return: void
     *  @Param: none
     */
    public void sortMenu()
    {//
        for(Role yo :myArray)
        {//
            playerGold+=yo.getCurrentGold();
            yo.setCurrentGold(0);
        }//
        String choice;
        String print;

        do
        {//
            
            System.out.println();
            System.out.println("Welcome to the pub!");
            System.out.println("You have "+playerGold+" coins");
            System.out.println("Please select an option");
            if(myCharacter.getName().equals("Egg")==false)
            {//
                System.out.println("Currently selected character: "+myCharacter.getName());
            }//
            System.out.println();
            System.out.println("(1) Create Your Character (SOBDO)");
            System.out.println("(2) Stay The Night");
            System.out.println("(3) Select From Your Roster");
            System.out.println("(4) Go On An Adventure!");
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
                    this.createCharacter();
                    break;
                    case '2':
                    if(playerGold>=100&&myArray!=null) 
                    {//
                        for(Role yo :myArray)
                        {//
                            yo.heal();
                        }//
                        cs();
                        System.out.println("All existing characters have been healed");
                        playerGold-=100;
                    }//
                    else
                    {//
                        cs();
                        System.out.println("You dont have enough gold");
                    }//

                    break;
                    case '3':
                    this.selectCharacter();
                    break;
                    case '4':
                    if(myCharacter.getName().equals("Egg")==false)
                    {//
                        myCharacter = advMenu.runAdventureMenu(myCharacter); 
                        myArray.set(cchoice, myCharacter);
                        for(Role yo :myArray)
                        {//
                            playerGold+=yo.getCurrentGold();
                            yo.setCurrentGold(0);
                        }//
                    }//
                    else
                    {//
                        cs();
                        System.out.println("You need to select a character to go on an adventure");
                    }//

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
     * Creates a Role object of type Warrior or Wizard and adds them to an ArrayList of availabele characters
     * You can name your character as well
     * @Pre: Only Run while in the sortMenu method
     * @Post: Should add your designated character to the ArrayList
     * @Return: void
     * @Param: none
     */
    public void createCharacter()
    {//
        cs();

        System.out.println();
        System.out.println("Choose from the list below the character you want to create");
        System.out.println();
        System.out.println("(1) Warrior");
        System.out.println("(2) Wizard");
        System.out.println();
        System.out.print("Choice ---> ");
        choice = in.next() + " ";
        if ('1' <= choice.charAt(0) && choice.charAt(0) <= '7')
        {//
            System.out.println();

            switch (choice.charAt(0))
            {//
                case '1':
                System.out.println("What do you want to name this Warrior?");
                choice = in.next()+" ";
                Warrior character = new Warrior(choice);
                myArray.add(character);
                cs();
                System.out.println(character.getName() + " has been added to the roster");
                break;
                case '2':
                System.out.println("What do you want to name this Wizard?");
                choice = in.next()+" ";
                Wizard newCharacter = new Wizard(choice);
                myArray.add(newCharacter);
                cs();
                System.out.println(newCharacter.getName() + " has been added to the roster");
                break;
            }//
        }//
    }//
    /**
     * Chooses one of the already made characters from the ArrayList and assigns that object
     * To the myCharacter object
     * @Pre: Assume indexOutOfBounds is taken care of
     * @Pre: Assume there is something in the ArrayList of Characters
     * @Post: Allows for AdventureMenu to be run successfully
     * @Param: none
     * @Return: void
     */
    public void selectCharacter()
    {//
        cs();
        boolean isEmpty=true;
        System.out.println();
        System.out.println("Select a character from the list below using numbers");
        for (int i=0;i<myArray.size();i++)
        {//
            System.out.println("("+i+") "+myArray.get(i).getName());
            isEmpty =false;

        }//
        if (isEmpty ==true)
        {//
            cs();
            System.out.println("Your Roster is Empty");
            System.out.println("You must create a character before you select one");
            return;
        }//
        cchoice = in.nextInt();
        if (isEmpty==false)
        {//
            myCharacter = myArray.get(cchoice);
        }//
        cs();
    }//
}//