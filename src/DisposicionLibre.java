import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLibre miMarco = new MarcoLibre();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoLibre extends JFrame{
	
	public MarcoLibre() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaLibre miLamina = new LaminaLibre();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());
		
		JLabel nombre = new JLabel("Nombre: ");
		
		JLabel apellido = new JLabel("Apellido: ");
		
		JLabel edad = new JLabel("Edad: ");
		
		JTextField c_nombre = new JTextField();
		
		JTextField c_apellido = new JTextField();
		
		JTextField c_edad = new JTextField();
		
		add(nombre);
		
		add(c_nombre);
		
		add(apellido);
		
		add(c_apellido);
		
		add(edad);
		
		add(c_edad);
	}
	
}

class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container miContenedor) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		int d = miContenedor.getWidth();
		
		x = d / 2;
		
		int n = miContenedor.getComponentCount();
		
		for (int i = 0; i < n; i++) {
			
			cont++;
			
			Component c = miContenedor.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
			if (cont%2==0) {
				x=d/2;
				y+=20;
			}
			
			System.out.println(x + "-" + y);
			
		}
		
		
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private int x;
	
	private int y=0;
	
}




