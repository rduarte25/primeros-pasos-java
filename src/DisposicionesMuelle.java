import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class DisposicionesMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoMuelle miMarco = new MarcoMuelle();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoMuelle extends JFrame{
	
	public MarcoMuelle() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaMuelle miLamina = new LaminaMuelle();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaMuelle extends JPanel{
	
	public LaminaMuelle() {
		
		JButton btn1 = new JButton("Boton 1");
		
		JButton btn2 = new JButton("Boton 2");
		
		JButton btn3 = new JButton("Boton 3");
		
		SpringLayout milayout = new SpringLayout();
		
		setLayout(milayout);
		
		add(btn1);
		
		add(btn2);
		
		add(btn3);
		
		Spring miMuelle = Spring.constant(0, 10, 100);
		
		Spring muelleRigido = Spring.constant(10);
		
		milayout.putConstraint(SpringLayout.WEST, btn1, miMuelle, SpringLayout.WEST, this);
		
		milayout.putConstraint(SpringLayout.WEST, btn2, muelleRigido, SpringLayout.EAST, btn1);
		
		milayout.putConstraint(SpringLayout.WEST, btn3, muelleRigido, SpringLayout.EAST, btn2);
		
		milayout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, btn3);
		
		
	}
	
}
