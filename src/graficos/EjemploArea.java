package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoArea miMarco = new MarcoArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaArea miLamina = new LaminaArea();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		//setLayout(new BorderLayout());
		
		textA1 = new JTextArea(8, 10);
		
		JScrollPane laminaSP = new JScrollPane(textA1);
		
		//textA1.setLineWrap(true);
		
		add(laminaSP);
		
		JButton btnTA = new JButton("Enviar");
		
		add(btnTA);
		
		btnTA.addActionListener(new GestionaArea());
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(textA1.getText());
			
		}
		
	}
	
	private JTextArea textA1;
	
}


