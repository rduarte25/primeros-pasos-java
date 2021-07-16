package practicas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lamina_Botones extends JPanel {

	public Lamina_Botones(String titulo, String [] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		grupo = new ButtonGroup();
		
		int cont=0;
		
		for (String op: opciones) {
			
			cont++;
			
			JRadioButton btn = new JRadioButton(op);
			
			btn.setActionCommand(op);
			
			add(btn);
			
			grupo.add(btn);
			
			btn.setSelected(cont == 1);
			
			
		}
		
	}
	
	public String dameSeleccion() {
		
		ButtonModel mibtn = grupo.getSelection();
		
		String s = mibtn.getActionCommand();
		
		return s;
		
	}
	
	private ButtonGroup grupo;
	
}
