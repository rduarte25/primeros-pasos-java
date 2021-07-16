package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora miMarco = new MarcoCalculadora();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
		
		
	}

}

class MarcoCalculadora extends JFrame {
	
	public MarcoCalculadora() {
		
		setTitle("Calsuladora");
		
		setBounds(300, 150, 300, 350);
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		
		add(miLamina);
		pack();
		
	}
	
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		miLamina2 = new JPanel();
		
		miLamina2.setLayout(new GridLayout(4,4));
		
		
		
		String[][] botones = {
				
				{"7", "8", "9", "/"},
				{"4", "5", "6", "*"},
				{"1", "2", "3", "-"},
				{"0", ".", "=", "+"},
				
		};
		
		ActionListener inserta = new InsertaNumero();
		
		ActionListener orden = new AccionOrden();
		
		for (String[] fbotones: botones) {
			for(String cbotones: fbotones) {
				
				switch(cbotones) {
					case "/":
						ponerBoton(cbotones, orden);
						
						break;
						
					case "*":
						ponerBoton(cbotones, orden);
						
						break;
						
					case "-":
						ponerBoton(cbotones, orden);
						
						break;
						
					case "+":
						ponerBoton(cbotones, orden);
						
						break;
						
					case "=":
						ponerBoton(cbotones, orden);
						
						break;
						
					default:
						
						ponerBoton(cbotones, inserta);
						
						break;
				}
				
			}
		}
		
		add(miLamina2, BorderLayout.CENTER);
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		miLamina2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String entrada = e.getActionCommand();
			
			if (pantalla.getText().contentEquals("0")) {
				pantalla.setText(entrada);
			} else {
				pantalla.setText(pantalla.getText() + entrada);
			}			
		}
		
	}
	
	private class AccionOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion = e.getActionCommand();
			
			System.out.println(operacion);
			
			ultimaOperacion = operacion;
			if ( pantalla.getText().equals(".") ) {
				pantalla.setText("0");
			} else if ( pantalla.getText().equals(" ") ){
				pantalla.setText("0");
			} else {
				calcular(Double.parseDouble(pantalla.getText()));
			}
			
			if (operacion.equals("+")) {
				pantalla.setText(" ");
			}
			
		}
		
		public void calcular(double x) {
			
			switch (ultimaOperacion) {
				case "=":
				
					break;
					
				case "/":
					resultado/=x;
					break;
					
				case "*":
					resultado*=x;
					break;
					
				case "+":
					resultado+=x;
					break;
					
				case "-":
					resultado-=x;
					break;
			}
			
			pantalla.setText("" + resultado);
			
		}
		
	}
	
	
	
	private JButton pantalla;
	
	private JPanel miLamina2;
	
	private double resultado;
	
	private String ultimaOperacion;
	
}



