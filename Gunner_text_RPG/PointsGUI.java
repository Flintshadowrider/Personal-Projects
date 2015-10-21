import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
/**
 * A Little demonstration of the JFrame GUI
 * 
 * @Author: Gunner Stone
 * @Version: created 5/20/2014
 */
public class PointsGUI extends JFrame implements ActionListener
{//starts PointsGUI class
    JPanel myPanel;
    JButton myButton;
    JLabel myLabel;
    /**
     *The Constructor for PointsGUI
     *
     */
    public PointsGUI()
    {//starts Constructor
        myPanel = new JPanel();
        myButton = new JButton("Hola");
        myButton.addActionListener(this);
        myLabel = new JLabel();

        myPanel.add(myButton);
        myPanel.add(myLabel);
        this.add(myPanel);
    }//ends Constructor

    /**
     * Driver for PointsGUI class
     */
    public static void main(String[]args)
    {//starts main Driver
        PointsGUI first = new PointsGUI();
        first.setTitle("Gui");
        first.setSize(300,200);
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first.setVisible(true);
    }//ends main Driver

    /**
     * If the button gets pressed a label will set its text to "clicked"
     *@Pre: PointsGUI already constructed
     *@Post: GUI outputted to screen
     *@Param: ActionEvent event
     *@Return: void
     */
    @Override
    public void actionPerformed(ActionEvent event)
    {//starts actionPerformed(ActionEvent event)
        if(event.getSource()==myButton)
        {//starts if1
            myLabel.setText("clicked");
        }//ends if1
    }//starts actionPerformed(ActionEvent event)
}//ends PointsGUI class