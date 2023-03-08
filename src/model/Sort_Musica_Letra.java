package model;

import java.util.Comparator;

public class Sort_Musica_Letra implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp=0; 
		if(o1!=null && o2!=null) {
			comp=o1.getAutor_musica().compareTo(o2.getAutor_musica());
		}
		if (comp==0) {
			comp=o1.getAutor_letras().compareTo(o2.getAutor_letras());
		}
		return 0;
	}

}
