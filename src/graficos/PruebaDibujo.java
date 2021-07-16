package graficos;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos miMarco = new MarcoConDibujos();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		setTitle("Prueba de Dibujo");
		setSize(400, 300);
		LaminaConFigura miLamina2 = new LaminaConFigura();
		add(miLamina2);
	}
}

class LaminaConFigura extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);
	}
}