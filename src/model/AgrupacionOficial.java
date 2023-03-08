package model;

import java.util.Iterator;

public abstract class AgrupacionOficial extends Agrupacion{

	
	private Integer puntos; 
	private Integrante [] participante; 
	
	public AgrupacionOficial() {
		super();
		participante = new Integrante [10]; 
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
	public boolean insertarIntegrante(Integrante i) {
		boolean added= false; 
		boolean isOk= false; 
		
		//Comprobamos que el integrante no esta ya incluido 
		for (int x = 0; x < participante.length; x++) {
			if (participante[x] != null && participante[x].equals(i)) {
				isOk= true; 
				break; 
			}
		}
		
		//Lo añadimos en el primer hueco null de array
		if(!isOk) {
			for (int j = 0; j < participante.length; j++) {
				if(participante[j]==null) {
					participante[j]=i;
					break; 
				}
			}
		}
		
		
		return added;
	}
	
	public boolean eliminatIntegrante(Integrante i) {
		boolean deleted=false;
		
		for (int j = 0; j < participante.length; j++) {
			if (participante[j]!= null && participante[j].equals(i)) {
				participante[j]=null; 
				deleted=true; 
				break; 
				
			}
		}
		
		return deleted; 
	}
	
	public abstract String caminitoDelFalla();

}
