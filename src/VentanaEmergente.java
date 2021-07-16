import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVE miMarco = new MarcoVE();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoVE extends JFrame{
	
	public MarcoVE() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaVE miLamina = new LaminaVE();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
	
	
}

class LaminaVE extends JPanel{
	
	public LaminaVE() {
		
		btn1 = new JButton("Boton 1");
		
		btn2 = new JButton("Boton 2");
		
		btn3 = new JButton("Boton 3");
		
		btn4 = new JButton("Boton 4");
		
		btn1.addActionListener(new Accion_Botones());
		
		btn2.addActionListener(new Accion_Botones());
		
		btn3.addActionListener(new Accion_Botones());
		
		btn4.addActionListener(new Accion_Botones());
		
		add(btn1);
		
		add(btn2);
		
		add(btn3);
		
		add(btn4);
		
	}
	
	private class Accion_Botones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource() == btn1) {
				
				JOptionPane.showMessageDialog(LaminaVE.this, "Este es una mesaje de prueba", "Mensaje emergente", 1);
				
				System.out.println("Haz pulsado en el boton 1.");
				
			} else if (e.getSource() == btn2) {
				
				JOptionPane.showInputDialog(LaminaVE.this, "Introduce el mensaje", "Mensaje", 2);
				
				System.out.println("Haz pulsado en el boton 2.");
				
			} else if (e.getSource() == btn3) {
				
				JOptionPane.showConfirmDialog(LaminaVE.this, "Elige Opcion", "V confirmar", 0);
				
				System.out.println("Haz pulsado en el boton 3.");
				
			} else if (e.getSource() == btn4) {
				
				JOptionPane.showOptionDialog(LaminaVE.this, "Elige una opcion", "Mensaje", 1, 1, new ImageIcon("src/graficos/Img/a.png"), null, 1);
				
				System.out.println("Haz pulsado en el boton 4.");
				
			}
			
		}
		
		
		
	}
	
	
	
	private JButton btn1;
	
	private JButton btn2;
	
	private JButton btn3;
	
	private JButton btn4;

	
}

