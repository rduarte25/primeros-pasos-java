import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosJText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEventosJText miMarco = new MarcoEventosJText();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoEventosJText extends JFrame{
	
	public MarcoEventosJText() {
		
		setBounds(300, 100, 300, 350);
		
		LaminaEventosJText miLamina = new LaminaEventosJText();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaEventosJText extends JPanel{
	
	public LaminaEventosJText() {
		
		campo1 = new JTextField(20);
		
		EscuchaTexto elEvento = new EscuchaTexto();
		
		
		add(campo1);
		
		Document miDoc = campo1.getDocument();
		
		miDoc.addDocumentListener(elEvento);
		
	}
	
	JTextField campo1;
	
}

class EscuchaTexto implements DocumentListener{

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Haz insertado texto");
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Haz barrado texto");
	}
	
}
