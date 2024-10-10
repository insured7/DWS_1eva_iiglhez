package serviciosMenu;

import java.util.Scanner;

/**
 * Clase de implementacion del menu principal
 */
public class CoincidentesMenuPrincipalImpl implements CoincidentesMenuPrincipalInterfaz {

	@Override
	public byte menuPrincipal() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[- Menú de la aplicación -]");
		System.out.println("1 - Menú empleado.");
		System.out.println("2 - Menú gerente.");
		System.out.println("0 - Salir.");
		
		System.out.println("¿Que opción desea?");
		return scan.nextByte();

	}

}
