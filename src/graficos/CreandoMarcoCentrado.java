package graficos;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Image;
public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado miVentana = new MarcoCentrado();
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setVisible(true);
		
	}

}

class MarcoCentrado extends JFrame {
	public MarcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		int anchuraPantalla = tamanoPantalla.width;
		
		setSize(anchuraPantalla/2, alturaPantalla/2);
		setLocation(anchuraPantalla/4, alturaPantalla/4);
		
		setTitle("Marco Central");
		Image miIcono = miPantalla.getImage("src/graficos/Icono.png");
		setIconImage(miIcono);
	}
}