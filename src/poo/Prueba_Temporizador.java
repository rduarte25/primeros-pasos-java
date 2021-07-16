package poo;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JOptionPane;
public class Prueba_Temporizador {
	public static void main (String[] args) {
		DameLaHora oyente = new DameLaHora();
		Timer miTemporizador = new Timer(2000, oyente);
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
		
	}
}

class DameLaHora implements ActionListener{
	public void actionPerformed(ActionEvent e){
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 8 segundo" + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}
