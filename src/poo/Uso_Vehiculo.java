package poo;
import javax.swing.JOptionPane;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Coche Renault = new Coche();
		
		Renault.establecer_color(JOptionPane.showInputDialog("Introduce el color de coche que deseas"));
		
		System.out.println(Renault.dime_datos_generales());
		System.out.println(Renault.dime_color());
		Renault.configura_asientos(JOptionPane.showInputDialog("Introduce si quieres asientos de cuero o no"));
		System.out.println(Renault.dime_asientos());
		Renault.configura_climatizador(JOptionPane.showInputDialog("Introduce si quieres climatizador"));
		System.out.println(Renault.dime_climatizador());
		System.out.println(Renault.dime_peso_coche());
		System.out.println("El precio del coche es " + Renault.precio_coche());
		*/
		
		Vehiculo coche1 = new Vehiculo();
		coche1.establecer_color("Amarillo");
		Furgoneta coche2 = new Furgoneta(4, 1500);
		
		
		coche2.establecer_color("Naranja");
		coche2.configura_asientos("si");
		coche2.configura_climatizador("si");
		
		System.out.println(coche1.dime_datos_generales() + " " + coche1.dime_color());
		
		System.out.println(coche2.dime_datos_generales() + " " + coche2.dime_color() + " " + coche2.dimeDatosFurgoneta());
	}

}
