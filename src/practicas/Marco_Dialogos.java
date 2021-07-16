package practicas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Marco_Dialogos extends JFrame{

	public Marco_Dialogos(){
	
		setTitle("Practica Dialogos");
	
		setBounds(200, 100, 600, 350);
		
		JPanel laminaC = new JPanel();
		
		laminaC.setLayout(new GridLayout(2,3));
		
		String[] box1 = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
		
		lamina_tipo = new Lamina_Botones("Tipo", box1);
		
		;
		
		lamina_tipo_mensaje = new Lamina_Botones("Tipo Mensaje", new String []{
				"ERROR_MESSAGE", 
				"INFORMATION_MESSAGE", 
				"WARNING_MESSAGE",
				"QUESTION_MESSAGE", 
				"PLAIN_MESSAGE",
				});
		
		lamina_mensaje = new Lamina_Botones("Mensaje", new String []{
				"Cadena", 
				"Icono", 
				"Componente", 
				"Otros",
				"Objects",
				});
		
		lamina_confirmar = new Lamina_Botones("Confirmar", new String []{
				"DEFAULT_OPTION", 
				"YES_NO_OPTION", 
				"YES_NO_CANCEL_OPTION", 
				"OK_CANCEL_OPTION",
				});
		
		lamina_opcion = new Lamina_Botones("Opción", new String []{
				"String", 
				"Icon", 
				"Object",
				});
		
		lamina_entrada = new Lamina_Botones("Entrada", new String []{
				"Campo de texto", 
				"Combo", 
				});
		
		setLayout(new BorderLayout());
		
		laminaC.add(lamina_tipo);
		
		laminaC.add(lamina_tipo_mensaje);
		
		laminaC.add(lamina_mensaje);
		
		laminaC.add(lamina_confirmar);
		
		laminaC.add(lamina_opcion);
		
		laminaC.add(lamina_entrada);
		
		//Contruimos la lamina inferior
		
		JPanel laminaMostrar = new JPanel();
		
		JButton btnMostrar = new JButton("Mostrar");
		
		btnMostrar.addActionListener(new AccionMostrar());
		
		laminaMostrar.add(btnMostrar);
		
		add(laminaMostrar, BorderLayout.SOUTH);
		
		add(laminaC, BorderLayout.CENTER);
		
		
		
	}
	
	//--------------------------------
	
	public Object dameMensaje() {
		
		String s = lamina_mensaje.dameSeleccion();
		
		switch (s) {
			case "Cadena":
				
				return cadena;
				
				//break;
			
			case "Icono":
				
				return iconoMensaje;
				
				//break;
				
			case "Componente":
				
				return componenteMensaje;
				
				//break;
				
			case "Otros":
				
				return objetoMensaje;
				
				//break;
				
			case "Objects":
				
				return new Object[]{
						cadena,
						iconoMensaje,
						componenteMensaje,
						objetoMensaje,
				};
				
				//break;
				
			default:
				return null;
				//break;
		}
		
	}
	
	//--------------------------------
	
	public int dameTipoIcono() {
		
		String s = lamina_tipo_mensaje.dameSeleccion();
		
		switch (s) {
			case "ERROR_MESSAGE":
				
				return 0;
				
				//break;
			
			case "INFORMATION_MESSAGE":
				
				return 1;
				
				//break;
				
			case "WARNING_MESSAGE":
				
				return 2;
				
				//break;
				
			case "QUESTION_MESSAGE":
				
				return 3;
				
				//break;
				
			case "PLAIN_MESSAGE":
				
				return -1;				
				//break;
				
			default:
				return -1;
				//break;
		}
		
	}
	
	//-----------------------------
	
public int dameOpcion() {

	String s = lamina_confirmar.dameSeleccion();
		
		switch (s) {
			case "DEFAULT_OPTION":
				
				return -1;
				
				//break;
			
			case "YES_NO_OPTION":
				
				return 0;
				
				//break;
				
			case "YES_NO_CANCEL_OPTION":
				
				return 1;
				
				//break;
				
			case "OK_CANCEL_OPTION":
				
				return 2;
				
				//break;
			default:
				return -1;
				//break;
		}
		
	}

	//--------------------------------

	public Object[] dameOpciones(Lamina_Botones lamina) {
		
		String s = lamina.dameSeleccion();
		
		switch (s) {
			case "String":
				return new String[] {
						"Azul",
						"Amarillo",
						"Rojo",
						};
			
			case "Icon":
				return new Object[] {
						new ImageIcon("src/graficos/Img/b.png"),
						new ImageIcon("src/graficos/Img/y.png"),
						new ImageIcon("src/graficos/Img/r.png"),
						};
				
			case "Object":
				return new Object[]{
						cadena,
						iconoMensaje,
						componenteMensaje,
						objetoMensaje,
				};
			
			default:
				return null;
		}
		
	}
	
	//--------------------------------
	
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		
			//System.out.println(lamina_tipo.dameSeleccion());
			
			switch (lamina_tipo.dameSeleccion()) {
				
				case "Mensaje":
					
					JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipoIcono());
					
					break;
					
				case "Confirmar":
					
					JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipoIcono(), 0);
					
					break;
					
				case "Opcion":
					
					JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameOpcion(), dameTipoIcono(), null, dameOpciones(lamina_opcion), null);
					
					break;
					
				case "Entrada":
					
					if (lamina_entrada.dameSeleccion().equals("Campo de texto")) {
						
						JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipoIcono());
						
					} else if (lamina_entrada.dameSeleccion().equals("Combo")) {
							
							JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", dameTipoIcono(), null, new String[] {"Azul", "Amarillo", "Rojo"}, "Azul");
							
						}					
				
					
					break;
			
			}
		}
				
	}
	
	private Lamina_Botones lamina_tipo, lamina_tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;
	
	private String cadena = "Mensaje";
	
	private Icon iconoMensaje = new ImageIcon("src/graficos/Img/a.png");
	
	private Object objetoMensaje = new Date();
	
	private Component componenteMensaje = new Lamina_Ejemplo();
	
	
}

class Lamina_Ejemplo extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(0,0, getWidth(), getHeight());
		
		g2.setPaint(Color.YELLOW);
		
		g2.fill(rectangulo);
		
	}
	
}
