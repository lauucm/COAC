package model;

public class Comparsa extends AgrupacionOficial implements Callejera{

	private String empresaAtrezzo; 
	
	public Comparsa () {
		
	}

	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa" + super.getNombre();
	}

	@Override
	public String hacerTipo() {
		return "La comparsa " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String caminitoDelFalla() {
		return "La comparsa " + super.getNombre()+ " va caminito del falla.";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escucha la comparsa" + super.getNombre();
	}
	

}
