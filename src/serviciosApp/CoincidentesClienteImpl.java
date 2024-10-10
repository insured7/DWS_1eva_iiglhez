package serviciosApp;

import java.util.List;
import java.util.Scanner;

import dto.Cliente;

/**
 * Implementacion de la interfaz CoincidentesClienteInterfaz
 * 10-10-24
 * iiglhez
 */
public class CoincidentesClienteImpl implements CoincidentesClienteInterfaz {

	@Override
	public Cliente addCliente() {
		Scanner scan = new Scanner(System.in);
		String nombre;
		String apellidos;
		
		System.out.println("¿Nombre del cliente?");
		nombre = scan.next();
		System.out.println("¿Apellidos del cliente?");
		apellidos = scan.next();
		
		Cliente cli = new Cliente(nombre,apellidos);
		
		return cli;
	}

}
