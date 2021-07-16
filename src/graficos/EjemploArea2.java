package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploArea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoArea2 miMarco = new MarcoArea2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoArea2 extends JFrame{
	
	public MarcoArea2() {
		
		setBounds(300, 100, 300, 350);		
		
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		laminaBtn = new JPanel();
		
		btnInsertar = new JButton("Insertar");
		
		btnInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaText.append("En un lugar de la mancha de donde no quiero acordarme...");
				
			}
			
		});
		
		laminaBtn.add(btnInsertar);
		
		btnSaltoL = new JButton("Salto Linea");
		
		btnSaltoL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean saltar = !areaText.getLineWrap();
				
				areaText.setLineWrap(saltar);
				
				if (saltar) {
					
					btnSaltoL.setText("Quitar Salto");
					
				} else {
					btnSaltoL.setText("Salto Linea");
				}
				
			}
			
			
			
		});
		
		laminaBtn.add(btnSaltoL);
		
		add(laminaBtn, BorderLayout.SOUTH);
		
		areaText = new JTextArea(8,20);
		
		laminaB = new JScrollPane(areaText);
		
		add(laminaB, BorderLayout.CENTER);
		
	}
	
	private JPanel laminaBtn;
	
	private JButton btnInsertar;
	
	private JButton btnSaltoL;
	
	private JTextArea areaText;
	
	private JScrollPane laminaB;
	
}


