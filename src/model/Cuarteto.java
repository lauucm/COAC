package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	
	private Integer num_miembros; 
	
	public Cuarteto () {
		
	}

	public Integer getNum_miembros() {
		return num_miembros;
	}

	public void setNum_miembros(Integer num_miembros) {
		this.num_miembros = num_miembros;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Cuarteto " + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "El cuarteto " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String caminitoDelFalla() {
		return "El cuarteto " + super.getNombre()+ " va caminito del falla.";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escucha el cuarteto " + super.getNombre();
	}
	
	
}
