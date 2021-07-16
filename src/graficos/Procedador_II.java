package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontFamilyAction;
import javax.swing.text.StyledEditorKit.StyledTextAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Procedador_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MenuProcesador_II miMarco = new MenuProcesador_II();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MenuProcesador_II extends JFrame{
	
	public MenuProcesador_II() {
		
		setBounds(300, 100, 600, 450);
		
		LaminaProcesador_II miLamina = new LaminaProcesador_II();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaProcesador_II extends JPanel{
	
	public LaminaProcesador_II() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu =  new JPanel();
		
		JMenuBar miBarra = new JMenuBar();
		
		//--------------------------------
		
		fuente = new JMenu("Fuente");
		
		estilo = new JMenu("Estilo");
		
		tamano = new JMenu("Tamaño");		
		
		//--------------------------------
		
		configuraMenu("Arial", "fuente", "Arial", 9, 10, "src/graficos/Img/a.png");
		
		configuraMenu("Couriel", "fuente", "Couriel", 9, 10, "src/graficos/Img/c.png");
		
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10, "src/graficos/Img/v.png");
		
		//--------------------------------
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD, 1, "src/graficos/Img/negrita.png");
		
		
		
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "src/graficos/Img/cursiva.png");
		
		//--------------------------------
		
		configuraMenu("12", "tamano", "", 9, 12, "");
		
		configuraMenu("16", "tamano", "", 9, 16, "");
		
		configuraMenu("18", "tamano", "", 9, 18, "");
		
		configuraMenu("20", "tamano", "", 9, 20, "");
		
		configuraMenu("22", "tamano", "", 9, 22, "");
		
		
		
		//--------------------------------
		miBarra.add(fuente);
		
		miBarra.add(estilo);
		
		miBarra.add(tamano);
		
		laminaMenu.add(miBarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		
		add(miArea, BorderLayout.CENTER);
		
		
		//------------------------------
		
		emergente = new JPopupMenu();
		
		JMenuItem negritaE = new JMenuItem("Negrita");
		
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		
		emergente.add(negritaE);
		
		emergente.add(cursivaE);
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		miArea.setComponentPopupMenu(emergente);
		
		
		
		//------------------------------
		
		barraP = new JToolBar();
		
		configura_barra("src/graficos/Img/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
		
		configura_barra("src/graficos/Img/cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
		
		configura_barra("src/graficos/Img/underline.png").addActionListener(new StyledEditorKit.UnderlineAction());
		
		barraP.addSeparator();
		
		configura_barra("src/graficos/Img/a.png").addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
		
		configura_barra("src/graficos/Img/y.png").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
		
		configura_barra("src/graficos/Img/r.png").addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));

		barraP.addSeparator();
		
		configura_barra("src/graficos/Img/text_left.png").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
		
		configura_barra("src/graficos/Img/text_center.png").addActionListener(new StyledEditorKit.AlignmentAction("centro", 1));
		
		configura_barra("src/graficos/Img/text_right.png").addActionListener(new StyledEditorKit.AlignmentAction("deracha", 2));
		
		configura_barra("src/graficos/Img/text_justify.png").addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
		
		barraP.setOrientation(1);
		
		add(barraP, BorderLayout.WEST);
		
	};
	
	public JButton configura_barra(String ruta) {
		
		JButton btnBarra = new JButton(new ImageIcon(ruta));
		
		barraP.add(btnBarra);
		
		return btnBarra;
		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String url) {
		
		if (menu == "estilo") {
			
			
			JCheckBoxMenuItem elem_menu = new JCheckBoxMenuItem(rotulo, new ImageIcon(url));
			
estilo.add(elem_menu);			
			
			if (estilos == Font.ITALIC) {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
				
				
			} else if (estilos == Font.BOLD) {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
				
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
				
			}
			
			
		} else if (menu == "fuente") {
			
			grupoBtn = new ButtonGroup();
			
			JRadioButtonMenuItem elem_menu = new JRadioButtonMenuItem(rotulo, new ImageIcon(url));
			
			grupoBtn.add(elem_menu);
			
			if (tipo_letra == "Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			} else if (tipo_letra == "Couriel") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Couriel"));
			} else if (tipo_letra == "Verdana") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}
			
			fuente.add(elem_menu);
			
		} else if (menu == "tamano") {
			
			JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(url));
			
			tamano.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", tam));
			
			if (rotulo == "22") {
				
			}
			
		}	
		
		
		
	}	
	
	
	
	private JTextPane miArea;
	
	private JMenu fuente, estilo, tamano;
	
	private Font letras;
	
	private ButtonGroup grupoBtn;
	
	private JPopupMenu emergente; 
	
	private JButton negritaBarra, cursivaBarra, subrrayadoBarra, azulBarra, amarilloBarra, rojoBarra, izquirdaBarra, centroBarra, derechaBarra, justificadoBarra;
	
	private JToolBar barraP;
}
