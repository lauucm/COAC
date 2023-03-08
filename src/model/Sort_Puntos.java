package model;

import java.util.Comparator;

public class Sort_Puntos implements Comparator <Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp=0;
		if (o1!=null && o2!= null) {
			if (o1 instanceof AgrupacionOficial && o2 instanceof AgrupacionOficial) {
				comp= ((AgrupacionOficial)o1).getPuntos().compareTo(((AgrupacionOficial)o2).getPuntos());
			}
		}
		return comp;
	}

}
