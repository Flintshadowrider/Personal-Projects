import java.util.*;
import java.io.*;
/**
 * This sorts a file of numbers from least to greatest
 * Uses Iterators
 * 
 * @author Gunner Stone 
 * @version created 5/20/14
 */
public class PointsIterator
{
    LinkedList <Item>myList = new LinkedList<Item>();
    Iterator <Item> iter = myList.iterator();
    /**
     * Constructor for objects of class PointsIterator
     */
    public PointsIterator()
    {
    }

    /**
     * Reads in the selected file and stores all numbers as Items in an ArrayList
     * @Pre: The File20 exists
     * @Post: Will add all elements of numbers into an arrayList as Items
     * @Params: String "File20.txt"
     * @Returns: void
     */
    public void loadFile(String inFileName)
    {//starts loadFile(String inFileName)
        try{//starts try1
            Scanner in = new Scanner (new File(inFileName));//makes a scanner to read in the file
            while ( in.hasNextInt() )
            {//starts while1
                int myNum = in.nextInt();
                int myAmount = in.nextInt();
                Item myItem = new Item(myNum,myAmount);
                myList.addLast(myItem);
            }//ends while1
        }//ends the try1
        catch(IOException e)
        {//starts catch1
            System.out.println(e.getMessage());
        }//ends catch1
    }//ends loadFile(String inFileName) 
    /**
     * Sorts by decreasing value between two indexes of an ArrayList
     * @Pre: LinkedList<Item>list is already created, first and last will not produce out of bounds
     * @Post: Sorts the list passed inside the parameters
     * @Parameters: int first, int last; Positions on the list
     * @Returns: void
     */
    public void selectionSortAN(LinkedList<Item>list, int first, int last)//descending Numbers
    {//starts selectionSortAN(LinkedList<Item>list, int first, int last)
        int min;
        Item temp;
        last++;
        for (int outer=first;outer<last-1;outer++)
        {//starts for1
            min=outer;
            for(int inner = outer +1; inner <last; inner++)
            {//starts for2
                if(list.get(inner).compareTo(list.get(min))<0)
                {//starts if1
                    min=inner;
                }//ends if1
            }//ends for2
            temp=list.get(outer);
            list.set(outer,list.get(min));
            list.set(min,temp);
        }//ends for1
        for(int i = 0;i<list.size();i++)
        {//starts for1
            System.out.println(list.get(i));
        }//ends for1
    }//ends selectionSortAN(LinkedList<Item>list, int first, int last)
    /**
     * Breaks ArrayList in two parts, seperates those in decreasing order, and then sorts the two pieces
     * @Pre: LinkedList<Item>A is already created, first mid and last will not produce out of bounds
     * @Post: Sorts the list passed inside the parameters
     * @Parameters: int first, int mid, int last; Positions on the list
     * @Returns :void
     */
    public void merge(LinkedList<Item> A,int first, int mid, int last)
    {//starts merge(LinkedList<Item> A,int first, int mid, int last)
        int total = last - first +1;
        boolean doneA,doneB;
        int Akey = first;
        int Bkey = mid+1;
        int Ckey = first;
        doneA=doneB=false;
        LinkedList<Item> C = new LinkedList <Item>(A);
        for(int loop =0; loop < total; loop++)
        {//starts for1
            if(doneA)
            {//starts if1
                C.set(Ckey, A.get(Bkey));
                Bkey++;
            }//ends if1
            else if(doneB)
            {//starts if2
                C.set(Ckey, A.get(Akey));
                Akey++;
            }//ends if2
            else if(A.get(Akey).compareTo(A.get(Bkey)) <= 0) //a<=b
            {//starts if3
                C.set(Ckey, A.get(Akey));
                Akey++;
            }//ends if3
            else //b<a
            {//starts else1
                C.set(Ckey, A.get(Bkey));
                Bkey++;
            }//ends else1
            doneA = Akey > mid;
            if(Bkey > last)
            {//starts if1
                doneB = true;
            }//ends if1
            Ckey++;
        }//ends for1
        for ( int i = 0; i < Ckey; i++ )//resets the origional array
            A.set( i, C.get(i) ); 
    }//ends merge(LinkedList<Item> A,int first, int mid, int last)
    /**
     * Uses recursion to sort an ArrayList in decreasing order
     * @Pre: LinkedList<Item>list is already created, first and last will not produce out of bounds
     * @Post: Sorts the list passed inside the parameters
     * @Parameters: int first, int last; Positions on the list
     * @Returns: void
     */
    public void recMergeSort(LinkedList <Item> list, int first, int last)
    {//starts recMergeSort(LinkedList <Item> list, int first, int last)
        int mid;
        if(first == last)
        { 
        }//ends the base case
        else
        {//starts else1
            mid = (first + last) / 2;
            recMergeSort(list, first, mid);
            recMergeSort(list, mid + 1, last);
            merge(list, first, mid, last);
        }//ends the else1
    }//ends recMergeSort(LinkedList <Item> list, int first, int last)
    /**
     * Runs the program
     * @Pre: Should only be called in the Driver
     * @Post: none;
     * @Parameters: none
     * @Returns: void
     */
    public void run()
    {//starts run()
        this.loadFile("file20.txt");
        this.recMergeSort(myList,0,19);
        for(int i = 0;i<myList.size();i++)
        {//starts for1
            System.out.println(myList.get(i));
        }//ends for1
    }//ends run()
}//ends the PointsIterator class
