import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;


public class Window extends JFrame
{
	public int COLUMNS=8;
	
	public int ROWS=9;
	
	public Window()
	{
		this.setTitle("SOKOBAN");
	    this.setSize(800,900);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    initialiseGrid();
	}
	
	public void initialiseGrid()
	{
		this.setLayout(new GridLayout(ROWS,COLUMNS));
		
		for(int numberOfCell=0;numberOfCell!=72;numberOfCell++)
		{
				JLabel test = new JLabel("test");
				this.add(test);
		}
	}
	
//TODO contenu des cases dans un tableau puis affichage dans swing ?
	
}