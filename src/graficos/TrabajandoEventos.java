package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class TrabajandoEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConEventos miMarcoEventos = new MarcoConEventos();
		miMarcoEventos.setVisible(true);
		miMarcoEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConEventos extends JFrame{
	public MarcoConEventos() {
		setTitle("Prueba Eventos");
		setBounds(350, 200, 300, 200);
		LaminaConEventos miLaminaEventos = new LaminaConEventos();
		add(miLaminaEventos);
		miLaminaEventos.setBackground(SystemColor.window);
		
		miLaminaEventos.setForeground(Color.BLUE);
	}
}


class LaminaConEventos extends JPanel implements ActionListener{
	
	JButton btnAzul = new JButton("Azul");
	
	JButton btnAmarillo = new JButton("Amarillo");
	
	JButton btnRojo = new JButton("Rojo");
	
	public LaminaConEventos() {
		add(btnAzul);
		
		add(btnAmarillo);		
		
		add(btnRojo);
		
		btnAzul.addActionListener(this);
		btnAmarillo.addActionListener(this);
		btnRojo.addActionListener(this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object btnPulsado = e.getSource();
		if (btnPulsado == btnAzul) {
			setBackground(Color.BLUE);
		} else if (btnPulsado == btnAmarillo) {
			setBackground(Color.YELLOW);
		} else if(btnPulsado == btnRojo) {
			setBackground(Color.RED);
		}
		
	}
	
}

