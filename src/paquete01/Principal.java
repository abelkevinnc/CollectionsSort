package paquete01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		List<Profesor> profesores = new ArrayList<Profesor>();

		profesores.add(new Profesor(3, "pepe"));
		profesores.add(new Profesor(23, "juan"));

		//Como la clase profesor ya tiene implementado el metodo compareTo de la interface Comparable
		// no existe nungun problema y se ordena segun el criterio codificado, en este caso por el nombre
		
		Collections.sort(profesores);
		for (Profesor p : profesores) {
			System.out.println(p);
		}

	}

}
