package model;

public class Chirigota extends AgrupacionOficial implements Callejera {

	
	private Integer numCuples; 
	
	public Chirigota() {
		super(); 
	}

	public Integer getNumCuples() {
		return numCuples;
	}

	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Chirigota " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La chirigota " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String caminitoDelFalla() {
		return "La chirigota " + super.getNombre()+ " va caminito del falla.";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escucha la chirigota" + super.getNombre();
	}
	
	
}
