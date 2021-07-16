package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRadioBtn miMarco = new MarcoRadioBtn();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRadioBtn extends JFrame{
	
	public MarcoRadioBtn() {
		
		setBounds(300, 100, 500, 350);
		
		LaminaRadioBtn miLamina = new LaminaRadioBtn();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaRadioBtn extends JPanel{
	
	public LaminaRadioBtn() {
		
		setLayout(new BorderLayout());
		
		text = new JLabel("En un lugar de la mancha de cuyo nombre ...");
		
		add(text, BorderLayout.CENTER);
		
		text.setFont(new Font("Serif", Font.PLAIN, 12));
		
		laminabtn = new JPanel();
		
		grupo1 = new ButtonGroup();
		
		colocarBtn("Pequeño", false, 10);
		
		colocarBtn("Mediano", true, 12);
		
		colocarBtn("Grande", false, 18);
		
		colocarBtn("Muy grande", false, 26);
		
		add(laminabtn, BorderLayout.SOUTH);
		
		/*
		
		ButtonGroup grupo1 = new ButtonGroup();
		
		btn1 = new JRadioButton("Pequeño", false);
		
		btn2 = new JRadioButton("Medianno", true);
		
		btn3 = new JRadioButton("Grande", false);
		
		btn4 = new JRadioButton("Muy grande", false);
		
		JPanel laminaRadio = new JPanel();
		
		EventoRadio miEvento = new EventoRadio();
		
		btn1.addActionListener(miEvento);
		
		btn2.addActionListener(miEvento);
		
		btn3.addActionListener(miEvento);
		
		btn4.addActionListener(miEvento);
		
		grupo1.add(btn1);
		
		grupo1.add(btn2);
		
		grupo1.add(btn3);
		
		grupo1.add(btn4);

		laminaRadio.add(btn1);
		
		laminaRadio.add(btn2);
		
		laminaRadio.add(btn3);
		
		laminaRadio.add(btn4);
		
		add(laminaRadio, BorderLayout.SOUTH);
		
		*/
	}
	
	public void colocarBtn(String nom, boolean select, final int tam) {
		
		JRadioButton boton = new JRadioButton(nom, select);
		
		grupo1.add(boton);
		
		laminabtn.add(boton);
		
		ActionListener miEvento =  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setFont(new Font("Serif", Font.PLAIN, tam));
			}
			
		};
		
		boton.addActionListener(miEvento);
		
	}
	
	/*
	
	private class EventoRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource() == btn1) {
				text.setFont(new Font("Serif", Font.PLAIN, 10));
			} else if (e.getSource() == btn2) {
				text.setFont(new Font("Serif", Font.PLAIN, 15));
			} else if (e.getSource() == btn3) {
				text.setFont(new Font("Serif", Font.PLAIN, 20));
			} else if (e.getSource() == btn4) {
				text.setFont(new Font("Serif", Font.PLAIN, 25));
			}
			
		}
		
	}*/
	
	
	private JLabel text;
	private JRadioButton btn1, btn2, btn3, btn4;
	private ButtonGroup grupo1;
	
	private JPanel laminabtn;
	
	
}

