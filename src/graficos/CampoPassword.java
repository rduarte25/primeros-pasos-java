package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCP miMarco = new MarcoCP();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCP extends JFrame{
	
	public MarcoCP() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaCP miLamina = new LaminaCP();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaCP extends JPanel{
	
	public LaminaCP() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaS = new JPanel();
		
		laminaS.setLayout(new GridLayout(2, 2));
		
		add(laminaS, BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario");
		
		JLabel etiqueta2 = new JLabel("Password");
		
		JTextField c_usuario = new JTextField(15);
		
		c_password = new JPasswordField(15);
		
		CompruebaPass eventoPass= new CompruebaPass();
		
		c_password.getDocument().addDocumentListener(eventoPass);
		
		laminaS.add(etiqueta1);
		
		laminaS.add(c_usuario);
		
		laminaS.add(etiqueta2);
		
		laminaS.add(c_password);
		
		JButton enviar = new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
	}
	
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] password = c_password.getPassword();
			
			if (password.length < 8 || password.length > 12) {
				
				c_password.setBackground(Color.RED);
				
			} else {
				c_password.setBackground(Color.WHITE);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] password = c_password.getPassword();
			
			if (password.length < 8 || password.length > 12) {
				
				c_password.setBackground(Color.RED);
				
			} else {
				c_password.setBackground(Color.WHITE);
			}
			
		}
		
	}
	
	JPasswordField c_password;
	
}



