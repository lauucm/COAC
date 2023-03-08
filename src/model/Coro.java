package model;

public class Coro extends AgrupacionOficial{

	
	private Integer num_bandurrias; 
	private Integer num_guitarras; 
	
	public Coro () {
		
	}

	public Integer getNum_bandurrias() {
		return num_bandurrias;
	}

	public void setNum_bandurrias(Integer num_bandurrias) {
		this.num_bandurrias = num_bandurrias;
	}

	public Integer getNum_guitarras() {
		return num_guitarras;
	}

	public void setNum_guitarras(Integer num_guitarras) {
		this.num_guitarras = num_guitarras;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El Coro " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String caminitoDelFalla() {
		return "El coro " + super.getNombre()+ " va caminito del falla.";
	}
	
	
}
