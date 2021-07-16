package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjemploSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoSlider miMarco = new MarcoSlider();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoSlider extends JFrame{
	
	public MarcoSlider() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaSlider miLamina = new LaminaSlider();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaSlider extends JPanel{
	
	public LaminaSlider() {
		
		/*
		JSlider control = new JSlider(0, 100, 50);
		
		//control.setOrientation(SwingConstants.VERTICAL);
		
		control.setMajorTickSpacing(25);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif", 3, 12));
		
		control.setSnapToTicks(true);
		
		add(control);
		*/
		
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de la mancha de cuyo nombre...");
		
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8, 50, 12);
		
		control.setMajorTickSpacing(10);
		
		control.setMinorTickSpacing(2);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif", 3, 10));
		
		JPanel laminaSlider =  new JPanel();
		
		control.addChangeListener(new EventoSlider());
		
	    laminaSlider.add(control);
	    
	    add(laminaSlider, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//cont++;
			
			//System.out.println("Estas manipulando el: " + control.getValue());
			
			rotulo.setFont(new Font("Serif", 3, control.getValue()));;
			
		}
		
	}
	
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int cont;
}

