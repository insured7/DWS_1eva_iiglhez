package serviciosMenu;

import java.util.Scanner;

/**
 * Clase que implementa la interfaz menugerenteInterfaz
 * 10-10-24
 */
public class CoincidentesMenuGerenteImpl implements CoincidentesMenuGerenteInterfaz {

	@Override
	public byte menuGerente() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[-Menú del gerente-]");
		System.out.println("1 - Crear nuevo cliente.");
		System.out.println("0 - Salir.");
		
		System.out.println("¿Que opción desea?");
		return scan.nextByte();
		
		
	}

}
