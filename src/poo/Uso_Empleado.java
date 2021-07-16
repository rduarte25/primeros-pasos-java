package poo;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Empleado empleado1 = new Empleado("Rafael Duarte", 50000.00, 2012, 10, 19);
		
		Empleado empleado2 = new Empleado("Luis Duarte", 40000.00, 2010, 06, 02);		
		
		Empleado empleado3 = new Empleado("Cira Méndez", 60000.00, 2008, 01, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: " + empleado1.dame_nombre() + " Sueldo: " + empleado1.dame_sueldo() + " Fecha de alta " + empleado1.dame_fecha_contrato());
		
		System.out.println("Nombre: " + empleado2.dame_nombre() + " Sueldo: " + empleado2.dame_sueldo() + " Fecha de alta " + empleado2.dame_fecha_contrato());
		
		System.out.println("Nombre: " + empleado3.dame_nombre() + " Sueldo: " + empleado3.dame_sueldo() + " Fecha de alta " + empleado3.dame_fecha_contrato());
		*/
		
		Jefatura jefeRRHH = new Jefatura("Rafael Duarte", 5000.00, 2019, 8, 25);
		
		jefeRRHH.establece_incentivo(200);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Rafael Duarte", 50000.00, 2012, 10, 19);
		
		misEmpleados[1] = new Empleado("Luis Duarte", 40000.00, 2010, 06, 02);
		
		misEmpleados[2] = new Empleado("Cira Méndez", 60000.00, 2008, 01, 15);
		
		misEmpleados[3] = new Empleado("Bertha Méndez");
		
		misEmpleados[4] = jefeRRHH;
		
		misEmpleados[5] = new Jefatura("Gabriel Angarita", 9500, 1999, 5, 4);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		jefa_Finanzas.establece_incentivo(500);
		
		
		System.out.println("Jefe: " + jefa_Finanzas.dame_nombre() + " tiene un bonus de " + jefa_Finanzas.establece_bonus(500));
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas días de vacaciones a los empleados"));
		
		
		System.out.println(misEmpleados[3].dame_nombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));
		
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e:misEmpleados) {
			System.out.println();
			System.out.println("Nombre: " + e.dame_nombre() + " Sueldo: " + e.dame_sueldo() + " Fecha de alta " + e.dame_fecha_contrato());
		}
		
		
		
	}

}
class Empleado implements Comparable, Trabajadores {
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes -1, dia);
		altaContrato = calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000,01,10);
	}
	
	public String dame_nombre() {
		return nombre;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if ( this.sueldo < otroEmpleado.sueldo ) {
			return -1;
		} else if ( this.sueldo > otroEmpleado.sueldo ) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base + gratificacion;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}

class Jefatura extends Empleado implements Jefes {
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);			
	}
	
	public void establece_incentivo(double b) {
		incentivo = b;
	}
	
	@Override
	public double dame_sueldo() {
		double sueldoJefe = super.dame_sueldo();
		return sueldoJefe + incentivo;
	}
	
	public String tomar_decisiones(String decision) {
		return "Un mienbro de la dirección a tomado la decisión de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
	private double incentivo;
	
	
}

class Director extends Jefatura {
	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);			
	}
}


