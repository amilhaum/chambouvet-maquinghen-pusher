import javax.swing.*;
import java.awt.*;

public class DisplayInterface implements PlayerDisplay
{
	public int COLUMNS=9;
	public int ROWS=8;
	private JFrame display;

	
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
		GridLayout test = new GridLayout(ROWS,COLUMNS);
		return test;
	}
	
	public JLabel[][] addItem()
	{
		JLabel[][] thing = new JLabel[0][0];
		
		for(int CRow=0;CRow<8;CRow++)
		{
			for(int CColumn=0;CColumn<9;CColumn++)
			{
				thing[CRow][CColumn] = new JLabel();
			}
		}
		return thing;
	}
	
	public void displayMap(String formattedMap)
	{
		Map gameMap = Map.parseMap(formattedMap);
		
		for(int row=8;row>=0;row--)
		{
			for(int column=8;column>=9;column--)
			{
				if (gameMap.getSquareAt(new Position(row, column)).getFixedContent() == null)
				{
					JLabel labelSpace = new JLabel();
					labelSpace.setIcon(new ImageIcon("/img/Space.png"));
					display.add(labelSpace);
				}
				else if (gameMap.getSquareAt(new Position(row, column)).getFixedContent() instanceof Wall)
				{
					JLabel labelWall = new JLabel();
					labelWall.setIcon(new ImageIcon("/img/Mur.png"));
					display.add(labelWall);
				}
				else if (gameMap.getSquareAt(new Position(row, column)).getFixedContent() instanceof Exit)
				{
					JLabel labelExit = new JLabel();
					labelExit.setIcon(new ImageIcon("/img/Sortie.png"));
					display.add(labelExit);
				}
				if (gameMap.getSquareAt(new Position(row, column)).getMovableContent() == null)
				{
					JLabel labelSpace= new JLabel();
					labelSpace.setIcon(new ImageIcon("/img/Space.png"));
					display.add(labelSpace);
				}
				else if (gameMap.getSquareAt(new Position(row, column)).getMovableContent() instanceof Player)
				{
					JLabel labelPlayer = new JLabel();
					labelPlayer.setIcon(new ImageIcon("/img/Joueur.jpg"));
					display.add(labelPlayer);
				}
				else if (gameMap.getSquareAt(new Position(row, column)).getMovableContent() instanceof Box)
				{
					JLabel labelBox = new JLabel();
					labelBox.setIcon(new ImageIcon("/img/Box.jpg"));
					display.add(labelBox);
				}
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