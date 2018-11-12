package es.carrito.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.carrito.exceptions.ErrorLecturaBd;
import es.carrito.services.ReadBd;


public class Empresa {

	Producto producto;
	Cliente cliente;
	
		 public static void consultarHistorial (){
			 
				
				System.out.println("**********************************");
				System.out.println("**********************************");
				
					 ReadBd leerhistorial = new ReadBd();
				     List<String> historialcompra = new ArrayList<String>();
				     try {
				    	 
				     
				    	 historialcompra = leerhistorial.retornarHistorial();
				       
				     if (historialcompra != null && ! historialcompra.isEmpty()) {
				        	for (String historial : historialcompra) {
				         System.out.println(historial);
							}
							
						} else {	
				        System.out.println("Historial vacio");
				 	}
				} catch (ErrorLecturaBd e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
		 }
		 
		 
}
