import java.util.Scanner;
public class Entrada_Ejemplo1 {
	public static void main( String args[] ) {
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Introduce tu numbre por favor");
		String nombre = entrada.nextLine();
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		System.out.println("Te llamas "+nombre+" y tienes "+edad+" años");
	}
}
