package paquete01;

//esta clase ni implementa comparable
public class Alumno {
	private Integer codigo;
	private String nombre;
	private Double notaPromedio;
	public Alumno(Integer codigo, String nombre, Double notaPromedio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.notaPromedio = notaPromedio;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public Double getNotaPromedio() {
		return notaPromedio;
	}
	public void setNotaPromedio(Double notaPromedio) {
		this.notaPromedio = notaPromedio;
	}
	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", notaPromedio=" + notaPromedio + "]";
	}
	
	
	
	
	
	
}
