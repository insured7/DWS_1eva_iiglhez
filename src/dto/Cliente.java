package dto;

/**
 * Clase de la entidad cliente, que contiene el id incremental, nombre y apellidos.
 * 10-10-24
 * iiglhez
 */
public class Cliente {

	private static int idContador = 0; //Contador estatico para autoincrementar ID
	private int id;
	private String nombre;
	private String apellidos;
	
	
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Cliente(String nombre, String apellidos) {
		super();
		this.id = ++idContador;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
	
}
