package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.*;
import serviciosMenu.*;
import serviciosApp.*;

/**
 * Clase principal donde ejecutaremos y gestionaremos la aplicacion de una tienda de barrio
 * 10-10-24
 * iiglhez
 */
public class App {

	public static void main(String[] args) {
		
		boolean salir = false;
		Scanner scan = new Scanner(System.in);
		byte opcionPrincipal = 0;
		byte opcionEmpleado = 0;
		byte opcionGerente = 0;
		Cliente cli = new Cliente();
		Venta venta = new Venta();
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Venta> listaVentas = new ArrayList<Venta>();
		CoincidentesMenuGerenteInterfaz menuGerente = new CoincidentesMenuGerenteImpl();
		CoincidentesMenuPrincipalInterfaz menuPricipal = new CoincidentesMenuPrincipalImpl();
		CoincidentesMenuEmpleadoInterfaz menuEmpleado = new CoincidentesMenuEmpleadoImpl();
		CoincidentesClienteInterfaz cliInt = new CoincidentesClienteImpl();
		CoincidentesVentaInterfaz ventaInt = new CoincidentesVentaImpl();
		boolean salirMenuEmpleado = false;
		boolean salirMenuGerente = false;

		//Menu Principal
		do {
			opcionPrincipal = menuPricipal.menuPrincipal();
			switch(opcionPrincipal) {
			
			//Menu Empleado
			case 1:
				do {
					opcionEmpleado = menuEmpleado.menuEmpleado();
					switch (opcionEmpleado) {
					case 1:					
						System.out.println("Opcion 1");
						venta = ventaInt.addVenta();
						listaVentas.add(venta);
						
						System.out.println("Venta añadida al cliente con id: " + venta.getIdCliente());
						
						break;
					case 2:
						System.out.println("Opcion 2");
						break;
					case 0:
						salirMenuEmpleado = true;
						break;
					default:
						salirMenuEmpleado = true;
						break;
					}
				} while (!salirMenuEmpleado);
				
				break;
				
			//Menu Gerente
			case 2:
				
				
				do {
					opcionGerente = menuGerente.menuGerente();
					switch (opcionGerente) {
					case 1: 
						System.out.println("Opcion 1");
						cli = cliInt.addCliente();
						listaClientes.add(cli);
						System.out.println("Cliente con el id: " + cli.getId() + " añadido.");
						break;
					case 0:
						salirMenuGerente = true;
						break;
					default:
						salirMenuGerente = true;
						break;
					}
				} while (!salirMenuGerente);
				
				break;
				
			case 0:
				System.out.println("Saliendo!");
				salir = true;
				break;
			}
		} while (!salir);
		}
}
		
		

