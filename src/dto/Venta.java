package dto;

import java.util.Date;

/**
 * Clase venta que tiene id, cantidad y el idcliente.
 * 10-10-24
 * iiglhez
 */
public class Venta {

	private static int idContador = 0; //Contador estatico para autoincrementar ID
	private int id;
	private int cantidad;
	private int idCliente;
	
	public int getId() {
		return id;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Venta(int cantidad, int idCliente) {
		super();
		this.id = ++idContador;
		this.cantidad = cantidad;
		this.idCliente = idCliente;
	}

	public Venta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cantidad=" + cantidad + ", idCliente=" + idCliente + "]";
	}
	
	
	
}
