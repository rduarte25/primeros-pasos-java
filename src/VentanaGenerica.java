import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoGenerico miMarco = new MarcoGenerico();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoGenerico extends JFrame{
	
	public MarcoGenerico() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaGenerico miLamina = new LaminaGenerico();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaGenerico extends JPanel{
	
	public LaminaGenerico() {
		
		
		
	}
	
}

