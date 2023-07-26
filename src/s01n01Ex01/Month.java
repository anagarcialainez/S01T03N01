package s01n01Ex01;

import java.util.Objects;

public class Month {
	private String name;

	public Month(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*Sobreescritura del método hashCode y equals para que el iterador detecte que los objetos son iguales
	través del nombre y no referencia */
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}
	
}

