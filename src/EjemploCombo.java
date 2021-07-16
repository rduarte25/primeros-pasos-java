import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploCombo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCombo miMarco = new MarcoCombo();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaCombo miLamina = new LaminaCombo();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha de cuyo nombre no quiero recordar...");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel laminaN = new JPanel();
		
		miCombo = new JComboBox();
		
		miCombo.addItem("Serif");
		
		miCombo.addItem("SansSerif");
		
		miCombo.addItem("Monospaced");
		
		miCombo.addItem("Dialog");
		
		EventoCombo miEvento = new EventoCombo();
		
		miCombo.addActionListener(miEvento);
		
		laminaN.add(miCombo);
		
		add(laminaN, BorderLayout.NORTH);
		
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN, 12));
			
		}
		
	}
	
	private JLabel texto;
	
	private JComboBox miCombo;
	
}


