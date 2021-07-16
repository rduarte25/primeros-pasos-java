package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaFoco extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaFoco ventana = new VentanaFoco();
		ventana.iniciar();
	}
	
	public void iniciar() {
		marco1 = new VentanaFoco();
		marco2 = new VentanaFoco();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(10, 100, 400, 350);
		marco2.setBounds(450, 100, 400, 350);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == marco1) {
			marco1.setTitle("Tengo el foco");
		} else if ( e.getSource() == marco2 ){
			marco2.setTitle("Tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == marco1) {
			marco1.setTitle("");
		} else if ( e.getSource() == marco2 ){
			marco2.setTitle("");
		}
	}
	
	VentanaFoco marco1;
	VentanaFoco marco2;

}
