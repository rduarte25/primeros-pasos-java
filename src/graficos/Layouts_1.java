package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLayout marco = new MarcoLayout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
	}

}

class MarcoLayout extends JFrame {
	
	public MarcoLayout() {
		
		setTitle("Layout 1");
		
		setBounds(300, 100, 400, 400);
		
		PanelLayout milayout = new PanelLayout();		
		
		add(milayout, BorderLayout.NORTH);
		
		PanelLayout1 milayout1 = new PanelLayout1();
		
		add(milayout1, BorderLayout.SOUTH);
	}
}

class PanelLayout extends JPanel {
	
	public PanelLayout() {
		
		//FlowLayout dispocision = new FlowLayout(FlowLayout.CENTER, 50, 20);
		
		//setLayout(dispocision);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Azul"));
		
		add(new JButton("Amarillo"));
		
		
	}
}

class PanelLayout1 extends JPanel{
	public PanelLayout1() {
		
		setLayout(new BorderLayout(10,20));
		
		add(new JButton("Rojo"), BorderLayout.WEST);
		
		add(new JButton("Verde"), BorderLayout.EAST);
		
		add(new JButton("Negro"), BorderLayout.CENTER);
		
		
	}
}