package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventosFoco ventanas;
		
		
	}
	
	class EventosFoco extends JFrame implements WindowFocusListener{
		public EventosFoco() {
			setVisible(true);
		}
		
		public void iniciar (){
		
			
			
		}

		@Override
		public void windowGainedFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowLostFocus(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	EventosFoco miMarcoFoco;	
	EventosFoco miMarcoFoco1;

}



class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadroFoco1 = new JTextField();
		cuadroFoco2 = new JTextField();
		
		cuadroFoco1.setBounds(60, 60, 100, 20);
		cuadroFoco2.setBounds(60, 100, 100, 20);
		
		add(cuadroFoco1);
		add(cuadroFoco2);
		
		LanzaFocos elFoco = new LanzaFocos();
		cuadroFoco1.addFocusListener(elFoco);
	}
	
	JTextField cuadroFoco1;
	JTextField cuadroFoco2;
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			//System.out.println("he ganado el foco");
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			//System.out.println("he perdido el foco");
			String email = cuadroFoco1.getText();
			boolean comp = false;
			for(int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					comp = true;
				}
			}
			
			if (comp) {
				System.out.println("Es correcto");
			} else {
				System.out.println("Es incorrecto");
			}
		}
		
	}
	
}


