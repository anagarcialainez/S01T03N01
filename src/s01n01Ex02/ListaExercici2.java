package s01n01Ex02;
import java.util.*;

public class ListaExercici2 {

	public static void main(String[] args) {
		// creando la primera lista
		List<Integer> primeraLista = new ArrayList<Integer>();

		// agregando elementos a la primera lista
		primeraLista.add(1);
		primeraLista.add(2);
		primeraLista.add(3);
		primeraLista.add(4);
		primeraLista.add(5);
		System.out.println("Primera lista\n" + primeraLista);

		List<Integer> segundaLista = new ArrayList<Integer>();
		segundaLista.add(6);
		segundaLista.add(7);
		segundaLista.add(8);
		segundaLista.add(9);
		segundaLista.add(10);
		System.out.println("Segunda lista\n" + segundaLista);

		// Creamos el iterador para las listas
		ListIterator<Integer> iter1 = primeraLista.listIterator();
		ListIterator<Integer> iter2 = segundaLista.listIterator();

		// Mediante el ciclo while lo recorremos e insertamos la lista1 en la lista2
		System.out.println("Recorremos y fusionamos las listas");

		while (iter1.hasNext()) {

			iter2.add(iter1.next());
		}
		System.out.println(segundaLista);

		// Iteramos la lista en orden inverso
		System.out.println("Iteramos la lista en orden inverso");
		ListIterator<Integer> iter3 = segundaLista.listIterator(segundaLista.size());
		while (iter3.hasPrevious()) {
			System.out.println(iter3.previous());
		}

	}
}
/*
 * Crea y rellena un List<Integer>. Crea un segundo List<Integer> e inserta en
 * la segunda lista los elementos de la primera en orden inverso. Emplea los
 * objetos ListIterator para leer los elementos de la primera lista e
 * insertarlos en la segunda.
 */
