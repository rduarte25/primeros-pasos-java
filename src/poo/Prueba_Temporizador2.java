package poo;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
public class Prueba_Temporizador2 {
	public static void main ( String[] args ) {
		
		Reloj miReloj = new Reloj();
		miReloj.enMercha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
		
	}
}

class Reloj {
	public void enMercha(int intervalo, final boolean sonido) {
		
		class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 2 segundo" + ahora);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
		}
			
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
				
			
	}
	
	private int intervalo;
	private boolean sonido;
	
	
	
}