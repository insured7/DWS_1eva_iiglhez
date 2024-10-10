package serviciosMenu;

import java.util.Scanner;

/**
 * Clase que implementa la interfaz de menu empleado
 * 10-10-24
 * iiglhez
 */
public class CoincidentesMenuEmpleadoImpl implements CoincidentesMenuEmpleadoInterfaz {

	@Override
	public byte menuEmpleado() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[- Menú del empleado -]");
		System.out.println("1 - Añadir compras a un cliente.");
		System.out.println("2 - Cálculo total de ventas mensual.");
		System.out.println("0 - Salir.");
		
		System.out.println("¿Que opción desea?");
		return scan.nextByte();
	}

}
