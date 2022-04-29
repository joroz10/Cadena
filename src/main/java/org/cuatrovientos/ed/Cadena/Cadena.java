package org.cuatrovientos.ed.Cadena;

public class Cadena {

	
	
	public Cadena() {}
	public int longitud(String cadena) {
		int longitud = cadena.length();
		return longitud;
	}
	public int vocales(String cadena) {
		String vocal = "aeiou";	
		int cont = 0;
		for(int i = 0; i< cadena.length(); i++) {
			char voc = cadena.charAt(i);
			String vocs = String.valueOf(voc);
			if (vocal.contains(vocs)) {
				cont++;
			}
		}
		return cont;
	}
	public String invertir(String cadena) {
		String invertido = "";
		for(int i = cadena.length()-1; i> 0; i--) {
			char voc = cadena.charAt(i);
			String vocs = String.valueOf(voc);
			invertido += vocs;
		}
		return invertido;
	}
	public int contarLetra(String cadena, char caracter) {	
		int cont = 0;
		for(int i = 0; i< cadena.length(); i++) {
			char voc = cadena.charAt(i);
			String vocs = String.valueOf(voc);
			if (cadena.contains(vocs)) {
				cont++;
			}
		}
		return cont;
	}
}
