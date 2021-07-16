package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujosColores miMarco2 = new MarcoConDibujosColores();
		miMarco2.setVisible(true);
		miMarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujosColores extends JFrame{
	public MarcoConDibujosColores() {
		setTitle("Prueba de Dibujo");
		setSize(500, 500);
		LaminaConFiguraColores miLaminaColores = new LaminaConFiguraColores();
		add(miLaminaColores);
		miLaminaColores.setBackground(SystemColor.window);
	}
}

class LaminaConFiguraColores extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(0,140,255));
		
		g2.fill(elipse);
		
		//g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double centroenX = rectangulo.getCenterX();
		double centroenY = rectangulo.getCenterY();
		
		double radio = 125;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		
		//g2.draw(circulo);
	}
}