package graficos;

import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class EventosVentanasEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConEventosEstado miMarco1 = new MarcoConEventosEstado();
		miMarco1.setTitle("Ventana 1");
		miMarco1.setBounds(100, 300, 200, 200);
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConEventosEstado extends JFrame{
	public MarcoConEventosEstado() {
		setVisible(true);
		cambiaEstado nEstado = new cambiaEstado();
		addWindowStateListener(nEstado);
	}
}

class cambiaEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e){
		System.out.println("La ventana a cambiado de estado");
		//System.out.println(e.getNewState()+" "+e.getOldState());
		if (e.getNewState() == 6) {
			System.out.println("La ventana esta maximizada");
		}
			
	}
}