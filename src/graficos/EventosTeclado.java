package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConEventosTeclado miMarco1 = new MarcoConEventosTeclado();
		miMarco1.setTitle("Ventana 1");
		miMarco1.setBounds(100, 300, 200, 200);
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}

class MarcoConEventosTeclado extends JFrame{
	public MarcoConEventosTeclado() {
		setVisible(true);
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);
	}
}

class EventoTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		System.out.println(letra);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}