package s01n01Ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMoth {

	public static void main(String[] args) {
		ArrayList<Month> listaMeses = new ArrayList<Month>();
		Month mes1 = new Month("Enero");
		Month mes2 = new Month("Febrero");
		Month mes3 = new Month("Marzo");
		Month mes4 = new Month("Abril");
		Month mes5 = new Month("Mayo");
		Month mes6 = new Month("Junio");
		Month mes7 = new Month("Julio");
		Month mes9 = new Month("Septiembre");
		Month mes10 = new Month("Octubre");
		Month mes11 = new Month("Noviembre");
		Month mes12 = new Month("Diciembre");

		listaMeses.add(mes1);
		listaMeses.add(mes2);
		listaMeses.add(mes3);
		listaMeses.add(mes4);
		listaMeses.add(mes5);
		listaMeses.add(mes6);
		listaMeses.add(mes7);
		listaMeses.add(mes9);
		listaMeses.add(mes10);
		listaMeses.add(mes11);
		listaMeses.add(mes12);

		System.out.println("--- muestra los todos los meses a excepción de agosto ---");
		for (int i = 0; i < listaMeses.size(); i++) {
			System.out.println(listaMeses.get(i).getName());
		}

		Month mes8 = new Month("Agosto");
		listaMeses.add(7, mes8); // insertamos agosto en la posisción correspondiente
		System.out.println("--- muestra los 12 meses en el orden establecido ---");
		for (int i = 0; i < listaMeses.size(); i++) {
			System.out.println(listaMeses.get(i).getName());
		}

		// Convirtiendo el ArrayList a HashSet a través de un constructor
		HashSet<Month> listaHashSet = new HashSet<>(listaMeses);  

		System.out.println("--- mostramos la lista a través de un for ---");

		for (Month mes : listaHashSet) {
			System.out.println(mes.getName());
		}

		Month mes13 = new Month("Noviembre");
		listaHashSet.add(mes13); // insertando un mes repetido
		System.out.println("--- Despues de ingresar un mes repetido (Noviembre)con un HashSet, no se repite --- ");
		for (Month mes : listaHashSet) {
			System.out.println(mes.getName());
		}

		// Recorriendo la lista con un iterator
		System.out.println("*** recorriendo la lista con un iterador ***");
		Iterator<Month> it = listaMeses.iterator();
		while(it.hasNext()) {
		System.out.println(it.next().getName());
		}
	}
}

/*
 * Crea una clase llamada Month con un atributo "name" (que almacenará el nombre
 * del mes del año). Añade 11 objetos Month (cada uno con su atributo diferente)
 * en un ArrayList, a excepción del objeto con atributo "Agost". Después,
 * efectúa la inserción en el sitio que corresponde a este mes y demuestra que
 * ArrayList mantiene el orden correcto. Convierte ArrayList del ejercicio
 * anterior en un HashSet y asegúrate de que no permite duplicados. Recorre la
 * lista con un for y con un iterador.
 */
