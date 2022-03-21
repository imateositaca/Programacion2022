package examenLRodriguez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeGratis {
	
	public static int consumiciones = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precio = 5.00; // ya se que el cafe es un poco caro pero mira como va la economia
		int numcon = 0;
		int total = 0;
		int id = 0;
		
		System.out.println("Introduzca el ID del consumidor"); 
		id = sc.nextInt(); // introducimos el id que nos diga el amable cliente que no se quejará de nosotros, espero
		
		consumicion(id);
		
		if (consumicion(id) == 4 || consumicion(id) == 8 || consumicion(id) == 12 || consumicion(id) == 16) { // descuentos de 4 en 4, hasta 16 porque el siguiente descuento es 15
			precio = precio * 0.75;
			total += precio;
		}
		if (consumicion(id) == 15) { // descuento del 5 %
			precio = precio  - ((total)*0.05);
			total += precio;
		} else {
			total += precio;
		}
		
		
		
	}
	
	
	public static void añadirCliente(int id) { // añadimos una opcion para meter clientes
		
		
		List<Integer> lst = new ArrayList<Integer>(); //añades un id a la lista
		int Identificacion = 1;
		if (lst.contains(id)) {
		 System.out.println("Ya está añadido");
		} else {
			Identificacion++;
			lst.add(Identificacion, id);
			
		}
		
	}
	
	public static int consumicion(int id) { // se asignan consumiciones a un numero especifico de id
		consumiciones++;
		if (consumiciones == 16) { // se reinicia para los descuentos
			consumiciones = 0;
		}
		return consumiciones;
	}
	
	
}
