package poo;

public class Furgoneta extends Vehiculo{
	private int capacidad_extra;
	private int plazas_extra;
	public Furgoneta(int plazas_extras, int capacidad_extra) {
		super();
		this.capacidad_extra = capacidad_extra;
		this.plazas_extra = plazas_extras;
		
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidad_extra + " y las plazas son" + plazas_extra;
	}
}
