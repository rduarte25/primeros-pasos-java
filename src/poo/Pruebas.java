package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Rafael");
		Empleados trabajador2 = new Empleados("Luis");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Cira");
		trabajador1.cambiaSeccion("Compras");
		//trabajador1.cambiaNombre("Abraham");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		System.out.println(Empleados.dame_idSiguiente());
	}

}

class Empleados{
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nom) {
		
		nombre = nom;
		seccion = "Administración";
		this.id = idSiguiente;
		idSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos(){
		return "El nombre es " + nombre + " y la sección es " + seccion + " y el id es " + id;
	}
	
	public static String dame_idSiguiente() {
		return "El id siguiente es: " + idSiguiente;
	}
	/*
	
	public void cambiaNombre(String nombre) {
		this.nombre = nombre;
	}
	*/
}
