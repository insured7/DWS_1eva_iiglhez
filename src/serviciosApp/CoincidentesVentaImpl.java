package serviciosApp;

import java.util.Scanner;

import dto.Cliente;
import dto.Venta;

/**
 * Implementacion de la interfaz CoincidentesVentaInterfaz
 * 10-10-24
 * iiglhez
 */
public class CoincidentesVentaImpl implements CoincidentesVentaInterfaz {

	@Override
	public Venta addVenta() {

		Scanner scan = new Scanner(System.in);
		int cantidad;
		int idCliente;
		
		System.out.println("¿Id del cliente?");
		idCliente = scan.nextInt();
		System.out.println("¿Cantidad a asignar?");
		cantidad = scan.nextInt();
		
		Venta venta = new Venta(cantidad, idCliente);
		
		return venta;
	}

}
