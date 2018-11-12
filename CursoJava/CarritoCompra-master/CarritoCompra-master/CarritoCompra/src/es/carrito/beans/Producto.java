package es.carrito.beans;

import java.util.ArrayList;
import java.util.List;

public class Producto {

	int id;
	private String nombre;
	private String descripcion;
	private int categoria;
	private double precio;
	private int stock;

	/**
	 * 
	 */
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param categoria
	 * @param precio
	 * @param stock
	 */
	public Producto(int id, String nombre, String descripcion, int categoria, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String toString() {

		return " [IdProducto] " + getId() + " [Producto] " + getNombre() + " [Descripcion:] " + getDescripcion()
				+ " [Precio:] " + getPrecio() + "€" + " [Stock:] " + getStock() + " [Categoria:] " + getCategoria();

	}
	

	static List<Producto> producto;

	public static void crearProductos() {
		System.out.println("*********************************************");
		System.out.println("*************Lista de Productos:*************");
		System.out.println("*********************************************");
		ArrayList<Producto> listaProducto = new ArrayList<Producto>();
		listaProducto.add(new Producto(1, "Colonia", "Barata colonia", 2, 12.35, 5));
		listaProducto.add(new Producto(2, "Manzana", "Verde Manzana", 1, 1.35, 20));
		listaProducto.add(new Producto(3, "Legia", "Barata Legia", 3, 5.55, 8));
		listaProducto.add(new Producto(4, "Amoniaco", "Para limpiar y desinfectar", 3, 2.55, 0));
		listaProducto.add(new Producto(5, "Tomate", "Tomate rojo de huerto", 1, 2.35, 20));
		listaProducto.add(new Producto(6, "Perfume", "Perfume olor juvenil", 2, 6.60, 2));

		for (int i = 0; i < listaProducto.size(); i++) { // recorre el arraylist igual que en el foreach de clientes
			System.out.println(listaProducto.get(i));

		
		}
		System.out.println("*******************************************");
		
		/*
		int i = 1;
		String res;
		int cat = 0;
		double precio = 0;
		int stock = 0;
		producto = new ArrayList<>();
		
		System.out.println("****************************************************************************");
		System.out.println("*\tOBLIGATORIO HACER DOS PRODUCTOS PARA QUE NO DE FALLO MÁS ADELANTE  *");
		System.out.println("****************************************************************************");
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("Por favor, introduzca nombre producto: ");
			String nombre = scanner.nextLine();
			System.out.printf("Por favor, introduzca una descripcion: ");
			String descripcion = scanner.nextLine();
			boolean salir = false;
			do {
				try {
					System.out.printf("Por favor, introduzca la categoria(1. Alimentacion, 2. Perfumeria, 3. Limpieza): ");
					cat = Integer.parseInt(scanner.nextLine());
					salir = true;
				} catch(NumberFormatException e) {
					salir = false;
				}
			} while(!salir || cat<1 || cat>3);
			
			salir = false;
			do {
				try {
					System.out.printf("Por favor, introduzca precio: ");
					precio = Double.parseDouble(scanner.nextLine());
					salir = true;
				} catch(NumberFormatException e) {
					salir = false;
				}
			} while(!salir);
			
			salir = false;
			do {
				try {
					System.out.printf("Por favor, introduzca stock: ");
					stock = Integer.parseInt(scanner.nextLine());
					salir = true;
				} catch(NumberFormatException e) {
					salir = false;
				}
			} while(!salir);
			
			System.out.printf("¿Desea continuar?(s/n): ");
			res = scanner.nextLine();

			producto.add(new Producto(i, nombre, descripcion, cat, precio, stock));
			i++;
		} while (i<5 && res.toUpperCase().equals("S"));*/

	}

}
