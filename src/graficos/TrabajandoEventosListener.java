package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoEventosListener {
	public static void main (String[] args) {
		MarcoConEventosListener miMarcoEventosListener = new MarcoConEventosListener();
		miMarcoEventosListener.setVisible(true);
		miMarcoEventosListener.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConEventosListener extends JFrame{
	public MarcoConEventosListener() {
		setTitle("Prueba Eventos");
		setBounds(350, 200, 300, 200);
		LaminaConEventosListener miLaminaEventosListener = new LaminaConEventosListener();
		add(miLaminaEventosListener);
		miLaminaEventosListener.setBackground(SystemColor.window);
		
		miLaminaEventosListener.setForeground(Color.BLUE);
	}
}

class LaminaConEventosListener extends JPanel{
	
	JButton btnAzul = new JButton("Azul");
	JButton btnAmarillo = new JButton("Amarillo");
	JButton btnRojo = new JButton("Rojo");
	
	
	
	public LaminaConEventosListener() {
		add(btnAzul);
		
		add(btnAmarillo);		
		
		add(btnRojo);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		btnAzul.addActionListener(Azul);
		btnAmarillo.addActionListener(Amarillo);
		btnRojo.addActionListener(Rojo);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			colorFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorFondo);
		}
		
		private Color colorFondo;
	}
	
	
}

