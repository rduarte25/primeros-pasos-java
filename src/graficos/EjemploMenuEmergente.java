package graficos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class EjemploMenuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEmergente2 miMarco = new MarcoEmergente2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoEmergente2 extends JFrame{
	
	public MarcoEmergente2() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaEmergente miLamina = new LaminaEmergente();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaEmergente extends JPanel{
	
	public LaminaEmergente() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar miBarra = new JMenuBar(); 
		
		JMenu fuente = new JMenu("Fuente");
		
		JMenu estilo = new JMenu("Estilo");
		
		JMenu tamano = new JMenu("Tamano");
		
		miBarra.add(fuente);
		
		miBarra.add(estilo);
		
		miBarra.add(tamano);
		
		laminaMenu.add(miBarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		JTextPane miArea =new JTextPane();
		
		add(miArea, BorderLayout.CENTER);
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		JMenuItem opcion3 = new JMenuItem("Opcion 3");
		
		emergente.add(opcion1);
		
		emergente.add(opcion2);
		
		emergente.add(opcion3);
		
		miArea.setComponentPopupMenu(emergente);
		
	}
	
}

