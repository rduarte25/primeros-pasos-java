import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DispocisionesCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCaja miMarco = new MarcoCaja();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class MarcoCaja extends JFrame{
	
	public MarcoCaja() {
		
		setBounds(300, 100, 200, 200);
		
		setTitle("Marco en la caja");
		
		setVisible(true);
		
		JLabel rotulo1 = new JLabel("Nombre");
		
		JTextField texto1 = new JTextField(50);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		
		cajaH1.add(rotulo1);
		
		cajaH1.add(Box.createHorizontalStrut(10));
		
		cajaH1.add(texto1);
		
		JLabel rotulo2 = new JLabel("contraseña");
		
		JPasswordField texto2 = new JPasswordField(10);
		
		texto2.setMaximumSize(texto1.getPreferredSize());
		
		Box cajaH2 = Box.createHorizontalBox();
		
		cajaH2.add(rotulo2);
		
		cajaH2.add(Box.createHorizontalStrut(10));
		
		cajaH2.add(texto2);
		
		JButton btn1 = new JButton("Ok");
		
		JButton btn2 = new JButton("Cancelar");
		
		Box cajaH3 = Box.createHorizontalBox();
		
		cajaH3.add(btn1);
		
		cajaH3.add(Box.createGlue());
		
		cajaH3.add(btn2);
		
		Box cajaV1 = Box.createVerticalBox();
		
		cajaV1.add(cajaH1);
		
		cajaV1.add(cajaH2);
		
		cajaV1.add(cajaH3);
		
		add(cajaV1, BorderLayout.CENTER);
	}
	
}

