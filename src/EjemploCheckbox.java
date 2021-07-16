import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCheckbox miMarco = new MarcoCheckbox();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCheckbox extends JFrame{
	
	public MarcoCheckbox() {
		
		setBounds(300, 100, 500, 350);
		
		LaminaCheckbox miLamina = new LaminaCheckbox();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaCheckbox extends JPanel{
	
	public LaminaCheckbox() {
		
		setLayout(new BorderLayout());
		
		Font miLetra = new Font("Serif", Font.PLAIN, 18);
		
		 text = new JLabel("En un lugar de la mancha de cuyo nombre");
		 
		 text.setFont(miLetra);
		 
		 JPanel laminaText = new JPanel();
		 
		 laminaText.add(text);
		 
		 add(laminaText, BorderLayout.CENTER);
		 
		 check1 = new JCheckBox("Negrita");
		 
		 check2 = new JCheckBox("Cursiva");
		 
		 check1.addActionListener(new ManejaChecks());
		 
		 check2.addActionListener(new ManejaChecks());
		 
		 JPanel laminaChecks = new JPanel();
		 
		 laminaChecks.add(check1);
		 
		 laminaChecks.add(check2);
		 
		 add(laminaChecks, BorderLayout.SOUTH);
		
	}
	
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo = 0;
			
			if (check1.isSelected()) {
				tipo += Font.BOLD;
			}
			
			if (check2.isSelected()) {
				tipo += Font.ITALIC;
			}
			
			text.setFont(new Font("Serif", tipo, 18));
			
		}
		
	}
	
	private JLabel text;
	
	private JCheckBox check1, check2;
	
}

