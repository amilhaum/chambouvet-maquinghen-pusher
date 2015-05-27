import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class DisplayInterface implements PlayerDisplay
{
	public int COLUMNS=8;
	public int ROWS=9;
	private JFrame display;
	private JLabel[][] thing;
	
	public DisplayInterface()
	{
		
		
		display = new JFrame();
		
		display.setTitle("SOKOBAN");
		display.setSize(800,900);
		display.setLocationRelativeTo(null);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		display.setVisible(true);
	}
	
	public GridLayout initialiseGrid()
	{
		GridLayout test = new GridLayout(8,9);
		return test;
	}
	
	public JLabel[][] addItem()
	{
		JLabel[][] displayTest = new JLabel[0][0];
		
		for(int CRow=0;CRow<8;CRow++)
		{
			for(int CColumn=0;CColumn<8;CColumn++)
			{
				displayTest[CRow][CColumn] = new JLabel();
			}
		}
		return displayTest;
	}
	
	public void displayMap(String formattedMap)
	{
		Map gameMap = Map.parseMap(formattedMap);
		
		for(int row=8;row>=0;row--)
		{
			for(int column=9;column>=0;column--)
			{
				//TODO if fixedItem == null then ... Else ....
			}
		}
	}

	@Override
	public void displayDirectionChoice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayVictoryMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayInvalidDirectionMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayHowToGiveUpMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayGiveUpMessage() {
		// TODO Auto-generated method stub
		
	}

}