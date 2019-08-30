package paquete01;

//esta clase implementa Comparable
public class Profesor implements Comparable<Profesor>{
	private Integer edad;
	private String nombre;
	
	
	public Profesor(Integer edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}


	@Override
	public int compareTo(Profesor o) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(o.nombre);
	}


	@Override
	public String toString() {
		return "Profesor [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
