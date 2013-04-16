import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guiJframe2 extends JFrame{
	private JLabel item1;
	
	public guiJframe2(){
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is going to show up on hover");
		add(item1);
	}
}
