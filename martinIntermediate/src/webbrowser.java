import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class webbrowser extends JFrame{
	private JTextField addressBar;
	private JEditorPane display;
	
	//constructor
	public webbrowser(){
		super("Martin Browser");
		
		addressBar = new JTextField("enter a URL");
		addressBar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						loadCrap(event.getActionCommand());
					}
				}
		);
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
			new HyperlinkListener(){
				public void hyperlinkUpdate(HyperlinkEvent event){
					if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
						loadCrap(event.getURL().toString());
					}
				}
			}
		);
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(500, 300);
		setVisible(true);
	}
	
	//loadCrap to display on the screen
	private void loadCrap(String userText){
		try{
			display.setPage(userText);
			addressBar.setText(userText);
		}
		catch(Exception e){
			System.out.println("Crap!");
		}
	}
}
