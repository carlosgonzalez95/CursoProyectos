package es.carrito.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	int id;
	String nombre;
	String apellido;
	String direccion;
	int telefono;

	/**
	 * 
	 */
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 */
	public Cliente(int id, String nombre, String apellido, String direccion, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String toString() {

		return " [ID Cliente] " + getId() + " [Nombre] " + getNombre() + " [Apellidos:] " + getApellido()
				+ " [Telefono:] " + getTelefono() + " [Direccion:] " + getDireccion();

	}

	static List<Cliente> cliente;
	public static void crearClientes() {
		System.out.println("*********************************************");
		System.out.println("*************Lista de Clientes*************");
		System.out.println("*********************************************");
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente.add(new Cliente(1, "Javi", "Gomez", "C/Tembleque 15", 617948914));
		listaCliente.add(new Cliente(2, "Jose", "Gonzalez", "C/Roma 12", 667948918));
		listaCliente.add(new Cliente(3, "Fernando", "Perez", "C/Del alamo 54", 647328953));
		listaCliente.add(new Cliente(4, "Raul", "Blanco", "C/Florido 2", 667948939));
		
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente);
		}
		System.out.println("*******************************************");
		/*
		int i = 1;

		cliente = new ArrayList<>();
		
		String res;
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("Por favor, introduzca su nombre: ");
			String nombre = scanner.nextLine();
			System.out.printf("Por favor, introduzca su apellido: ");
			String apellido = scanner.nextLine();
			System.out.printf("Por favor, introduzca su dirección: ");
			String dir = scanner.nextLine();
			int tlf = 0;
			boolean salir = false;
			do {
				try {
					System.out.printf("Por favor, introduzca su teléfono: ");
					tlf = Integer.parseInt(scanner.nextLine());
					salir = true;
				} catch(NumberFormatException e) {
					salir = false;
				}
				
			} while(!salir);
			
			System.out.printf("¿Desea continuar?(S/N): ");
			res = scanner.nextLine();
			
			cliente.add(new Cliente(i, nombre, apellido, dir, tlf));
			i++;
		} while (i<3 && res.toUpperCase().equals("S"));*/
	}

}
