/**
 * 
 */
package es.carrito.main;

import java.lang.invoke.SwitchPoint;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import es.carrito.beans.Cliente;
import es.carrito.beans.Empresa;
import es.carrito.beans.Producto;

/**
 * @author aula6
 *
 */
public class Carrito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion1;
do {
		Scanner menu = new Scanner(System.in);
		System.out.println("*********************************************");
		System.out.println("*********************************************");
		System.out.println(
				" 1: Consultar Listado de Productos \n 2: Consultar listado de Clientes \n 3: Historial de compras \n 4: Control de Stock \n 5: Comprar");
		System.out.println("*********************************************");
		System.out.println("Elige una opcion:");
		System.out.println("*********************************************");
		opcion1 = menu.nextInt();
		
		

	switch (opcion1) {
		case 1:
			Producto.crearProductos();
			break;
		case 2:
			Cliente.crearClientes();
			break;
		case 3:
			Empresa.consultarHistorial();
			break;
		default:
			System.out.println("Opcion no disponible");
			break;
		}
} while (opcion1 != 3);
		

	}

}
