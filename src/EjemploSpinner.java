import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class EjemploSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoSpinner miMarco = new MarcoSpinner();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoSpinner extends JFrame{
	
	public MarcoSpinner() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaSpinner miLamina = new LaminaSpinner();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		//String[] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		
		JSpinner control =  new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
			
			@Override
			public Object getNextValue() {
				
				return super.getPreviousValue();
				
			}
			
			@Override
			public Object getPreviousValue() {
				
				return super.getNextValue();
				
			}
			
		});
		
		Dimension d = new Dimension(50, 20);
		
		control.setPreferredSize(d);
		
		add(control);
		
	}
	
	
	/*
	private class MiModeloSpinner extends SpinnerNumberModel{
		
		public MiModeloSpinner() {
			
			super(5,0,10,1);
			
		}
		
		@Override
		public Object getNextValue() {
			
			return super.getPreviousValue();
			
		}
		
		@Override
		public Object getPreviousValue() {
			
			return super.getNextValue();
			
		}
		
	}*/
	
}

