package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EjemploMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoMenu miMarco = new MarcoMenu();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoMenu extends JFrame{
	
	public MarcoMenu() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaMenu miLamina = new LaminaMenu();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaMenu extends JPanel{
	
	public LaminaMenu() {
		
		JMenuBar miMenu = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		
		JMenu edicion = new JMenu("Edición");
		
		JMenu herramientas = new JMenu("Herramientas");
		
		miMenu.add(archivo);
		
		JMenuItem guardar = new JMenuItem("Guardar");
		
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/graficos/Img/cortar.png"));
		
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/graficos/Img/copiar.png"));
		
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/graficos/Img/pegar.png"));
		
		pegar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		JMenuItem generales = new JMenuItem("Generales");
		
		archivo.add(guardar);
		
		archivo.add(guardarComo);
		
		edicion.add(cortar);
		
		edicion.add(copiar);
		
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		opciones.add(opcion1);
		
		opciones.add(opcion2);
		
		miMenu.add(edicion);
		
		miMenu.add(herramientas);

		add(miMenu);
		
	}
	
}


