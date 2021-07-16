package graficos;

import java.awt.BorderLayout;
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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Barra miMarco1 = new Marco_Barra();
		
		miMarco1.setTitle("Ventana Barra Herramientas");
		
		miMarco1.setBounds(10, 100, 400, 350);
		
		miMarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Barra extends JFrame{
	public Marco_Barra() {
		
		setVisible(true);
		
		lamina = new PanelAccion2();
		
		add(lamina);
		
		//Configuración acciones
		
		Action accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/Img/negrita.png"), Color.BLUE);
		
		Action accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/Img/cursiva.png"), Color.YELLOW);
		
		Action accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/Img/c.png"), Color.RED);
		
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("src/graficos/Img/v.png")) {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				System.exit(0);
				
			}			
		};
		
		JMenu menu_color = new JMenu("Color");
		
		menu_color.add(accionAzul);
		
		menu_color.add(accionAmarillo);
		
		menu_color.add(accionRojo);
		
		menu_color.addSeparator();
		
		menu_color.add(accionSalir);
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menu_color);
		
		setJMenuBar(barraMenu);
		
		//Construcción Barra de herramientas-
		
		JToolBar barra = new JToolBar();
		
		barra.add(accionAzul);
		
		barra.add(accionAmarillo);
		
		barra.add(accionRojo);
		
		barra.addSeparator();
		
		barra.add(accionSalir);
		
		add(barra, BorderLayout.NORTH);
		
		
		
		/*
		lamina.add(new JButton(accionAzul));
		
		lamina.add(new JButton(accionAmarillo));
		
		lamina.add(new JButton(accionRojo));
		
		InputMap mapaEntrada = lamina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		KeyStroke tclAzul = KeyStroke.getKeyStroke("ctrl A");
		
		KeyStroke tclAmarillo = KeyStroke.getKeyStroke("ctrl B");
		
		KeyStroke tclRojo = KeyStroke.getKeyStroke("ctrl R");
		
		mapaEntrada.put(tclAzul, "fondo_azul");
		
		mapaEntrada.put(tclAmarillo, "fondo_amarillo");
		
		mapaEntrada.put(tclRojo, "fondo_rojo");
		
		ActionMap mapaAccion = lamina.getActionMap();
		
		mapaAccion.put("fondo_azul", accionAzul);
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		mapaAccion.put("fondo_rojo", accionRojo);
		*/
	
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
			
			lamina.setBackground(c);
		}
		
		
	}
	
	private PanelAccion2 lamina;
}

class PanelAccion2 extends JPanel{
	public PanelAccion2() {
		
		
		
		
		
	}
	
	
}

