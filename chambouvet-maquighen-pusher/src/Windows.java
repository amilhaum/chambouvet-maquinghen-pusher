import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;


public class Windows extends JFrame
{
	public Windows()
	{
		this.setTitle("Game");
	    this.setSize(800,900);
	    this.setLocationRelativeTo(null);
	    setLayout(new GridLayout(9,8));
	    
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    
	}
	
	
}
