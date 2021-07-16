package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAcciones miMarco1 = new MarcoAcciones();
		
		miMarco1.setTitle("Ventana Accion");
		
		miMarco1.setBounds(10, 100, 400, 350);
		
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoAcciones extends JFrame{
	public MarcoAcciones() {
		
		setVisible(true);
		
		PanelAccion lamina = new PanelAccion();
		
		add(lamina);
		
		
		
	}
}

class PanelAccion extends JPanel{
	public PanelAccion() {
		
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/Img/Icono.png"), Color.BLUE);
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/Img/Icono.png"), Color.YELLOW);
		
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/Img/Icono.png"), Color.RED);
		
		add(new JButton(accionAzul));
		
		add(new JButton(accionAmarillo));
		
		add(new JButton(accionRojo));
		
		
		
		/*
		
		JButton btnAzul = new JButton("Azul");
		
		JButton btnAmarillo = new JButton("Amarillo");
		
		JButton btnRojo = new JButton("Rojo");
		
		add(btnAzul);
		
		add(btnAmarillo);
		
		add(btnRojo);
		
		*/
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke tclAzul = KeyStroke.getKeyStroke("ctrl A");
		
		KeyStroke tclAmarillo = KeyStroke.getKeyStroke("ctrl B");
		
		KeyStroke tclRojo = KeyStroke.getKeyStroke("ctrl R");
		
		mapaEntrada.put(tclAzul, "fondo_azul");
		
		mapaEntrada.put(tclAmarillo, "fondo_amarillo");
		
		mapaEntrada.put(tclRojo, "fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_azul", accionAzul);
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		mapaAccion.put("fondo_rojo", accionRojo);
	}
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nom, Icon icon,Color colorbtn) {
			
			putValue(Action.NAME, nom);
			
			putValue(Action.SMALL_ICON, icon);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nom);
			
			putValue("color_fondo", colorbtn);
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c = (Color)getValue("color_fondo");
			
			setBackground(c);
		}
		
	}
	
	
}





