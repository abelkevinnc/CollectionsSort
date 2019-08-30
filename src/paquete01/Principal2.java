package paquete01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Principal2 {
	public static void main(String[] args) {
		List<Alumno> alumnos = new ArrayList<Alumno>();

		alumnos.add(new Alumno(27151478, "gilberto", 13.2));
		alumnos.add(new Alumno(271374, "adam", 12.5));
		alumnos.add(new Alumno(2716465, "valentin", 17.0));

		// como alumno no implementa de Comparable haremos que se use la interfaz
		// Comparator

		// 1. podemos hacerlo dentro de la llamada al metodo
		Collections.sort(alumnos, new Comparator<Alumno>() {
					@Override
					public int compare(Alumno o1, Alumno o2) {
						return o1.getCodigo() - o2.getCodigo();
					}
		});
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
		System.out.println("---------------");
		
		//2. hacemos lo mismo pero usando lambdas
		Comparator<Alumno> comparator = (x, y) -> x.getNombre().compareToIgnoreCase(y.getNombre());

		Collections.sort(alumnos, comparator);
		
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
		System.out.println("---------------");
		
		//3. otra forma, para ordenar por nota promedio
	
		Comparator<Alumno> ordenarNotaPromedio =(x,y) -> {
			double diff = x.getNotaPromedio() - y.getNotaPromedio();
			return diff > 0 ? 1 : (diff < 0 ? -1 : 0);
		};
		Collections.sort(alumnos, ordenarNotaPromedio);
		for (Alumno a : alumnos) {
			System.out.println(a);
		}

	}

}
