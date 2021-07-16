package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Principal miMarco = new Marco_Principal();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {

		setTitle("Prueba Varios");
		
		setBounds(300, 100, 300, 200);
		
		Lamina_Principal miLamina = new Lamina_Principal();
		
		add(miLamina);
	}
}

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal(){
		
		JButton btnNuevo = new JButton("Nuevo");
		
		add(btnNuevo);
		
		btnCerrar = new JButton("Cerrar todo");
		
		add(btnCerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		
		btnNuevo.addActionListener(miOyente);
		
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			MarcoEmergente nuevoMarco = new MarcoEmergente(btnCerrar);
			
			nuevoMarco.setVisible(true);
			
			
		}
		
	}
	
	
	JButton btnCerrar;
}

class MarcoEmergente extends JFrame{
	
	public MarcoEmergente(JButton btnCerrar) {
		
		cont++;
		
		setTitle("Ventana" + cont);
		
		setBounds(40*cont, 50*cont, 300, 350);
		
		CierraTodo oyenteCerrar = new CierraTodo();
		
		btnCerrar.addActionListener(oyenteCerrar);
		
		
	}
	
	private class CierraTodo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
			
		}
		
	}
	
	private static int cont = 0;
}