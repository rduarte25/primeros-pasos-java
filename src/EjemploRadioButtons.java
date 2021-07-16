import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRadio miMarco = new MarcoRadio();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaRadio miLamina = new LaminaRadio();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaRadio extends JPanel{
	
	public LaminaRadio() {
		
		ButtonGroup grupo1 = new ButtonGroup();
		
		ButtonGroup grupo2 = new ButtonGroup();
		
		JRadioButton btn1 = new JRadioButton("Azul", false);
		
		JRadioButton btn2 = new JRadioButton("Rojo", true);
		
		JRadioButton btn3 = new JRadioButton("Verde", false);
		
		JRadioButton btn4 = new JRadioButton("Masculino", false);
		
		JRadioButton btn5 = new JRadioButton("Femenino", false);
		
		grupo1.add(btn1);
		
		grupo1.add(btn2);
		
		grupo1.add(btn3);
		
		grupo2.add(btn4);
		
		grupo2.add(btn5);
		
		add(btn1);
		
		add(btn2);
		
		add(btn3);
		
		add(btn4);
		
		add(btn5);
		
		
		
	}
	
}

