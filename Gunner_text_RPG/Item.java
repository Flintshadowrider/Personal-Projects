import java.util.*;
/**
 * This has Wrapper Classes
 * 
 * @author Gunner Stone
 * @version created 5/20/2014
 */
public class Item
{//starts Item class
   Integer myItemNum=new Integer(0);
   Integer myItemAmount=new Integer(0);
   /**
    * Contructor for the Item class
    */
   public Item(int firstNum, int secondNum)
   {//starts Item(int firstNum, int secondNum)
       myItemNum=firstNum;
       myItemAmount=secondNum;
    }//ends Item(int firstNum, int secondNum)
    /**
     * Returns the value inside the myItemNum variable
     * @PreCondition: none
     * @PostCondition: none
     * @Param: none
     * @Return: int myItemNum
     */
   public int getNum()
   {//starts getNum()
       return myItemNum;
    }//ends getNum()
    
    /**
     * Returns the value inside the myItemAmount variable
     * @PreCondition: none
     * @PostCondition: none
     * @Param: none
     * @Return: int myItemAmount
     */
   public int getAmount()
   {//starts getAmount()
       return myItemAmount;
    }//ends getAmount()
   
    /**
     * Sets the value inside the myItemNum variable
     * @PreCondition: dont set any negative nums or zero
     * @PostCondition: none
     * @Param: int input
     * @Return: void
     */
    public void setNum(int input)
   {//starts setNum(int input)
       myItemNum=input;
    }//ends setNum(int input)
    
    /**
     * Sets the value inside the myItemAmount variable
     * @PreCondition: dont set any negative nums or zero
     * @PostCondition: none
     * @Param: int input
     * @Return: void
     */
   public void setAmount(int input)
   {//starts setAmount(int input)
       myItemAmount=input;
    }//ends setAmount(int input)

    /**
     * Returns a String of both numbers seperated by a space " "
     * @PreCondition: none
     * @PostCondition: none
     * @Param: none
     * @Return: String myItemNum+" "+myItemAmount
     */
    public String toString()
   {//starts toString()
       return(myItemNum+" " +myItemAmount);
    }//ends toString()
    
    /**
     * Compares two items, if this Item is bigger/equal to/smaller than parameter Item
     * @PreCondition: none
     * @PostCondition: will return 0,-1,1
     * @Param: Item other
     * @Return: int
     */
    public int compareTo(Item other)
    {//starts compareTo(Item other)
        if (myItemNum>other.getNum())
        {//starts if1
            return 1;
        }//ends if1
        if(myItemNum==other.getNum())
        {//starts if1
            return 0;
        }//ends if1
        else
        {//starts else1
            return -1;
        }//ends else1
    }//ends compareTo(Item other)
}//ends Item class
