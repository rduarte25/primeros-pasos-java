package graficos;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
public class EscribiendoEnMarco {
	public static void main(String[] args) {
		MarcoConTexto miMarco1 = new MarcoConTexto();
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer titulo");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
	
}

class Lamina extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Estamos aprendinendo Swing", 100, 100);
		
	}
}