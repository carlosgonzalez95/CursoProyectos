package es.carrito.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import es.carrito.exceptions.*;

public class ReadBd {
	public List<String> retornarHistorial() throws ErrorLecturaBd {

		List<String> historial = new ArrayList<String>();

		Path path = Paths.get(
				"/e/proyectos/repositorio/cursojava/carritocompra-master/carritocompra-master/carritocompra/historialcompra.txt");

		try {

			historial = Files.readAllLines(path);

		} catch (IOException e) {

			throw new ErrorLecturaBd("Fallo leyendo el archivo", e);
		} finally {
			System.out.println("Finalizada lectura de archivo");

		}
		return historial;

	}

	public List<String> retornarHistorialPropagandoError() throws IOException {

		List<String> contenido = new ArrayList<>();

		Path path = Paths.get(
				"/Users/P.era-1/Downloads/CarritoCompra-master/CarritoCompra-master/CarritoCompra/historialcompra.txt");
		contenido = Files.readAllLines(path);

		return contenido;
	}
}