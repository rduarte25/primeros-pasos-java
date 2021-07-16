package graficos;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConEventosVentana miMarco1 = new MarcoConEventosVentana();
		miMarco1.setTitle("Ventana 1");
		miMarco1.setBounds(100, 300, 200, 200);
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoConEventosVentana miMarco2 = new MarcoConEventosVentana();
		miMarco2.setTitle("Ventana 2");
		miMarco2.setBounds(350, 300, 200, 200);
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoConEventosVentana extends JFrame{
	public MarcoConEventosVentana() {
		//setTitle("Prueba Eventos");
		//setBounds(350, 200, 300, 200);
		MVentana oVentana = new MVentana();
		setVisible(true);
		addWindowListener(oVentana);
	}
}

class MVentana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana Activada");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando Ventana");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana restaurada");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("La ventana se minimozo");
		
	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
	}
	
	
}