package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujosFuentes miMarco3 = new MarcoConDibujosFuentes();
		miMarco3.setVisible(true);
		miMarco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujosFuentes extends JFrame{
	public MarcoConDibujosFuentes() {
		setTitle("Prueba de Dibujo");
		setSize(500, 500);
		LaminaConFiguraFuentes miLaminaFuentes = new LaminaConFiguraFuentes();
		add(miLaminaFuentes);
		miLaminaFuentes.setBackground(SystemColor.window);
		
		miLaminaFuentes.setForeground(Color.BLUE);
	}
}

class LaminaConFiguraFuentes extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font miFuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(miFuente);
		
		//g2.setColor(Color.CYAN);
		
		g2.drawString("Rafael Duarte", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 30));
		
		//g2.setColor(new Color(200, 200, 200));
		
		g2.drawString("Soy ingeniero", 200, 200);
		
	}
}
