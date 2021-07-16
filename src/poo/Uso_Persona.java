package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Rafael Duarte", 50000, 2009, 2, 25);
		lasPersonas[1] = new Alumno("Rafael Duarte", "Ingenieria Informática");
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
		
	}*/

}

abstract class Persona {
	
	public Persona (String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona {
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public double dame_sueldo() {
		return sueldo;
	}
	
	public Date dame_fecha_contrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un id" + id + "con un sueldo igual a" + sueldo;
	}
	
	private int id;
	private double sueldo;
	private Date altaContrato;
	
}

class Alumno extends Persona {
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
		
	}
	
	public String dameDescripcion(){
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	private String carrera;
}