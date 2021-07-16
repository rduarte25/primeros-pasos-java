package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConEventosRaton miMarco1 = new MarcoConEventosRaton();
		miMarco1.setTitle("Ventana 1");
		miMarco1.setBounds(100, 300, 200, 200);
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConEventosRaton extends JFrame{
	public MarcoConEventosRaton() {
		setVisible(true);
		EventosRaton1 raton = new EventosRaton1(); 
		addMouseListener(raton);
	}
}

class EventosRaton1 implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("El usuario a hecho click");
		System.out.println("Coordenadas X y Y:" + arg0.getX() +" " + arg0.getY() + " Clicks " + arg0.getClickCount());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Entro");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Salio");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("El usuario a presionado el click");
		System.out.println(arg0.getModifiersEx());
		if (arg0.getModifiersEx() == 1024) {
			System.out.println("Izquierdo");
		} else if (arg0.getModifiersEx() == 2048) {
			System.out.println("Rueda");
		} else if (arg0.getModifiersEx() == 4096) {
			System.out.println("Derecho");
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("El usuario a soltado el click");
	}
	
}

