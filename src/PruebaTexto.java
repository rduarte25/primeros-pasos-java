import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto miMarco = new MarcoTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaTexto miLamina = new LaminaTexto();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina2 = new JPanel();
		
		lamina2.setLayout(new FlowLayout());
		
		JLabel texto1 = new JLabel("Email: ");
		
		lamina2.add(texto1);
		
		campo1 = new JTextField(20);
		
		lamina2.add(campo1);
		
		JButton enviar = new JButton("Comprobar");
		
		resultado = new JLabel("", JLabel.CENTER);
		
		add(resultado, BorderLayout.CENTER);
		
		DameTexto miEvento = new DameTexto();
		
		enviar.addActionListener(miEvento);
		
		lamina2.add(enviar);
		
		add(lamina2, BorderLayout.NORTH);
		
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			System.out.println(campo1.getText().trim());
			
			int correcto = 0;
			
			String email = campo1.getText().trim();
			
			if (email.length() <= 3) {
				
				ArrayIndexOutOfBoundsException miExcepsion = new ArrayIndexOutOfBoundsException();
				
				throw miExcepsion;
				
			} else {
				
				for(int i = 0; i < email.length(); i++) {
					if (email.charAt(i) == '@') {
						correcto++;
					}
				}
				
				if (correcto == 1) {
				
					resultado.setText("El email es correcto");
				
				} else {
					
					resultado.setText("El email es incorrecto");
				
				}
				
			}
			
		}
	}
	
	private JTextField campo1;
	
	private JLabel resultado;
	
}
