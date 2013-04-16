import javax.swing.JFrame;

class adapterMain {
	public static void main(String[] args){
		adaptGUI go = new adaptGUI();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(300, 200);
		go.setVisible(true);
	}
}
