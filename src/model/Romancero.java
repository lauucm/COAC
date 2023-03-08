package model;

public class Romancero extends Agrupacion implements Callejera{

	
	private String tematica; 
	
	public Romancero() {
		
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El romancer " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escucha el romancero " + super.getNombre();
	}
	
	
}
