package graficos;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
public class PruebaDibujo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos2 miMarco2 = new MarcoConDibujos2();
		miMarco2.setVisible(true);
		miMarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos2 extends JFrame{
	public MarcoConDibujos2() {
		setTitle("Prueba de Dibujo");
		setSize(500, 500);
		LaminaConFigura2 miLamina22 = new LaminaConFigura2();
		add(miLamina22);
	}
}

class LaminaConFigura2 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double centroenX = rectangulo.getCenterX();
		double centroenY = rectangulo.getCenterY();
		
		double radio = 125;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		
		g2.draw(circulo);
	}
}