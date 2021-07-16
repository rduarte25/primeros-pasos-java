package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class TrabajandoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConImagen miMarco = new MarcoConImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConImagen extends JFrame{
	public MarcoConImagen() {
		setTitle("Prueba Imagenes");
		setBounds(350, 200, 300, 200);
		LaminaConImagen miLaminaImagen = new LaminaConImagen();
		add(miLaminaImagen);
		miLaminaImagen.setBackground(SystemColor.window);
		
		miLaminaImagen.setForeground(Color.BLUE);
	}
}


class LaminaConImagen extends JPanel {
	
	public LaminaConImagen() {
		File miImagen = new File("src/graficos/Img/Icono.png");
		
		try {
			imagen = ImageIO.read(miImagen);
		} catch(IOException e) {
			System.out.println("La imagen no se ha podido encontrar");
		}
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (imagen == null) {
			
			g.drawString("No pudemos cargar la imagen", 10, 10);
			
		} else {
			
			int anchuraImagen = imagen.getWidth(this);
			int alturaImagen = imagen.getHeight(this);
			
			g.drawImage(imagen,0,0,null);
			
			
			
			g.copyArea(0, 0, 60, 60, 150, 75);
			for (int i = 0; i < 300; i++) {
				for (int j = 0; j < 200; j++) {
					if ( i+j>0 ) {
						g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i, alturaImagen * j);
					}
					 
				}
			}
			
		}
		
		

	}
	
	private Image imagen;
}

