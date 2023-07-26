package s01n01Ex03;

import java.util.*;

public class Fichero_HashMap {
	private HashMap<String, String> paisesCapitales;

	public Fichero_HashMap() {
		paisesCapitales = new HashMap<>();
	}

	// Método, recibe un pais y capital que se introducirá en el HashMap como nuevo
	// para clave-valor
	public void nuevoPar(String pais, String capital) {
		paisesCapitales.put(pais, capital);
	}

	// Este método recibe un país buscará y devolverá su correspondiente capital
	public String damepais(String pais) {
		return paisesCapitales.get(pais);
	}

	// El método devolverá un país aleatoriamente
	public String paisAleatorio() {

		int numPal = paisesCapitales.size();

		int numAl = (int) (Math.random() * numPal);

		String pais = (String) paisesCapitales.keySet().toArray()[numAl];

		return pais;
	}
}
