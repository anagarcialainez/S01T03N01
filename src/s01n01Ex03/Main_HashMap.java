package s01n01Ex03;

import java.io.*;
import java.util.*;

public class Main_HashMap {
	private static Fichero_HashMap paisesCapitales = new Fichero_HashMap();
	private static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		rellenarPaisesCapitales();
		juego();

	}

	// Método para rellenar mi objeto
	private static void rellenarPaisesCapitales() {

		try {
			// acceder al archivo lo hacemos a través de la clase File
			File fichero = new File(
					"/Users/anagarcia/eclipse-workspace/S01T03N01AnaGarcia/src/s01n01Ex03/Countries.txt");

			// extraer la información del archivo
			FileReader fr = new FileReader(fichero);

			BufferedReader br = new BufferedReader(fr);

			// Recorremos y extraermos las linea con un while, las almacenamos en la
			// variable linea
			String linea = "";
			while ((linea = br.readLine()) != null) {
				String array[] = linea.split(" "); // este array guardará las 2 palabras que el metodo split separa

				// guardar el par de palabras con el metodo nuevoPar
				paisesCapitales.nuevoPar(array[0], array[1]);
			}

			// cerramos nuestro flujo de datos
			br.close();

		} catch (Exception e) {
			System.out.println("Error en la lectura desde el archivo");
		}
	}

	private static void juego() {
		String pais;
		String nomUsuario;
		String capital;
		String respuesta;

		int totPreg = 0;
		int totAciertos = 0;
		int totErrores = 0;

		// Pedimos el nombre al usuario
		System.out.println("Escribe tu nombre: ");
		nomUsuario = lector.nextLine();

		do {
			// generamos pais aleatorio
			pais = paisesCapitales.paisAleatorio();

			/* mostramos pais por pantalla */
			System.out.println("La capital de " + pais + "? ");
			respuesta = lector.nextLine();

			if (totPreg < 10) {
				totPreg++; // contador contestacion valida
				capital = paisesCapitales.damepais(pais);
				if (respuesta.equalsIgnoreCase(capital)) { // comparamos si la respuesta del usuario es igual

					System.out.println("¡¡CORRECTO!!");
					totAciertos++; // cuenta los aciertos
				} else {
					System.out.println("¡NO! La respuesta correcta es " + capital);
					totErrores++; // cuenta los errores
				}

			}

		} while (totPreg < 10);

		String aEscribir = "El jugador: " + nomUsuario + " tiene un total de " + totAciertos + "\n";

		try {
			String ruta = "/Users/anagarcia/eclipse-workspace/S01T03N01AnaGarcia/src/s01n01Ex03/classificacio.txt";

			// String contenido = "prueba de contenido";
			File file = new File(ruta);
			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(aEscribir);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// sacamos por pantalla lo siguiente:
		System.out.println("Total de preguntas: " + totPreg);
		System.out.println("Total de aciertos: " + totAciertos);
		System.out.println("Total de errores: " + totErrores);

	}
}

/*
 * Dado el archivo countrties.txt (revisa el apartado recursos) que contiene
 * países y capitales. El programa debe leer el archivo y guardar los datos en
 * un HashMap<String, String>. El programa pide el nombre del usuario/a, y
 * después debe mostrar un país de forma aleatoria, guardado en HashMap. Se
 * trata de que el usuario debe escribir el nombre de la capital del país en
 * cuestión. Si acierta se le suma un punto. Esta acción se repite 10 veces. Una
 * vez solicitadas las capitales de 10 países de forma aleatoria, entonces debe
 * guardarse en un fichero llamado classificacio.txt, el nombre del usuario y su
 * puntuación.
 */
